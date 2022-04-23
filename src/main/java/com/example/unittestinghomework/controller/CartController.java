package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class CartController {
    private final CartService cartService;

    @GetMapping("/carts")
    public List<Cart> getAllUserCarts() { return cartService.getAllCarts(); }

    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable Integer id) { return cartService.getCartById(id); }

    @PostMapping("/carts")
    public void createCustomer(@RequestBody Cart cart) { cartService.insertCart(cart); }

    @PostMapping("/carts/update")
    public Cart updateCartDetails(@RequestBody Cart cart) {
        cartService.updateCart(cart);
        return cart;
    }

    @DeleteMapping("/carts/delete/{id}")
    public void deleteCart(@PathVariable Integer id) { cartService.deleteCartById(id); }

    @GetMapping("/carts/sorted")
    public List<Cart> getCartsSorted(List<Cart> carts){
        return cartService.compareByNumberOfProducts(carts);
    }
}
