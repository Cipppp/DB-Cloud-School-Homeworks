package com.example.unittestinghomework.unit;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.Product;
import com.example.unittestinghomework.service.CartService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class CartServiceTest {

    @Autowired
    private CartService cartService;

    @Test
    public void giveEmptyList_WhenAddingCartObject_ThenCartListNotNull() {
        Cart cart = new Cart();
        cart.setId(1);
        cart.setPrice(100);
        cart.setNumberOfProducts(20);
        cart.setProductsList(new ArrayList<>());
        cart.addProduct(new Product("milk", 4, 100));
        Assertions.assertNotNull(cart.getProductsList());

        // When deleting element cart size must be equal to 0
        cart.removeProduct(cart.getProductsList().get(0));
        Assertions.assertEquals(0, cart.getProductsList().size());

        // TODO: operations with cartService

    }
}
