package com.example.unittestinghomework.unit;

import com.example.unittestinghomework.model.Wishlist;
import com.example.unittestinghomework.service.WishlistService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class WishlistServiceTest {

    @Autowired
    private WishlistService wishlistService;

    @Test
    public void givenFewProducts_WhenAddingToWishlist_ThenWishListNotNull() {

        List<Wishlist> wishlistProducts = new ArrayList<>();
        wishlistProducts.add(new Wishlist());
        wishlistProducts.add(new Wishlist());
        wishlistProducts.add(new Wishlist());

        // Check if the list is empty
        Assertions.assertNotNull(wishlistProducts);

        // Check if list size is 3
        Assertions.assertEquals(3, wishlistProducts.size());

        // TODO: operations with wishlistService

    }
}
