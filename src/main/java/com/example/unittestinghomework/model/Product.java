package com.example.unittestinghomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    private String productName;
    private Integer price;
    private Integer quantity;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Wishlist wishlist;

    @ManyToOne
    private OrderHistory orderHistory;

    public Product(String productName, Integer price, Integer quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

}
