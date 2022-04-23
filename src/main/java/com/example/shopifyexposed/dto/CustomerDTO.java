package com.example.shopifyexposed.dto;

import com.example.shopifyexposed.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDTO {
    private String name;
    private List<Order> orders;

    public CustomerDTO(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }


}
