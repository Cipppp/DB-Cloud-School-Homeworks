package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    public Cart getCartById(Integer id) { return cartRepository.getById(id); }

    public List<Cart> getAllCarts() { return cartRepository.findAll(); }

    public void insertCart(Cart cart) { cartRepository.save(cart); }

    public void removeCart(Cart cart) {
        cartRepository.delete(cart);
    }

    public void deleteCartById(Integer id) { cartRepository.delete(getCartById(id)); }

    public void updateCart(Cart cart) { cartRepository.save(cart); }

    public Cart saveCart(Cart cart) { return cartRepository.save(cart); }

    public List<Cart> compareByNumberOfProducts(List<Cart> carts)
    {
        Stream<Cart> stream =  carts.stream();
        return stream.sorted(new Comparator<Cart>() {
            @Override
            public int compare(Cart o1, Cart o2) {
                return o1.getNumberOfProducts() - o2.getNumberOfProducts();
            }
        }).collect(Collectors.toList());
    }

}
