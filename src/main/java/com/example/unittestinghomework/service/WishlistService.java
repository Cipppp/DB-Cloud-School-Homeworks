package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.Wishlist;
import com.example.unittestinghomework.repository.WishlistRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WishlistService {

    private final WishlistRepository wishlistRepository;

    public Wishlist getWishlistById(Integer id) { return wishlistRepository.getById(id); }

    public List<Wishlist> getAllWishlists() { return wishlistRepository.findAll(); }

    public void insertWishlist(Wishlist wishlist) { wishlistRepository.save(wishlist); }

    public void removeWishlist(Wishlist wishlist) { wishlistRepository.delete(wishlist); }

    public void deleteWishlist(Integer id) { wishlistRepository.delete(getWishlistById(id)); }

    public void updateWishlist(Wishlist wishlist) { wishlistRepository.save(wishlist); }

}
