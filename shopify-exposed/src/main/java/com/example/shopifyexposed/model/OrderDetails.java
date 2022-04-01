package com.example.shopifyexposed.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer quantity;

    public OrderDetails(Integer id, Integer quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public OrderDetails() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
