package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.Wishlist;
import com.example.unittestinghomework.service.WishlistService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class  WishlistController {
    private final WishlistService wishlistService;

    @GetMapping("/wishlist")
    public List<Wishlist> getAllWishlists() { return wishlistService.getAllWishlists(); }

    @GetMapping("/wishlist/{id}")
    public Wishlist getWishlistById(@PathVariable Integer id) { return wishlistService.getWishlistById(id); }

    @PostMapping("/wishlist")
    public void createWishlist(@RequestBody Wishlist wishlist) { wishlistService.insertWishlist(wishlist); }

    @PostMapping("/wishlist/update")
    public Wishlist updateWishlistDetails(@RequestBody Wishlist wishlist) {
        wishlistService.updateWishlist(wishlist);
        return wishlist;
    }

    // Delete cart with specific user id
    @DeleteMapping("/wishlist/delete/{id}")
    public void deleteWishlist(@PathVariable Integer id) { wishlistService.deleteWishlist(id); }

}
