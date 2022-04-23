package com.example.shopifyexposed.controllers;


import com.example.shopifyexposed.model.OrderDetails;
import com.example.shopifyexposed.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderDetailsController {

    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/order_details")
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsService.getAllOrderDetails();
    }

    @GetMapping("/order_details/{id}")
    public OrderDetails getOrderDetailsById(@PathVariable Integer id) {
        return orderDetailsService.getOrderDetailsById(id);
    }

    @PostMapping("/order_details")
    public OrderDetails createOrderDetails(@RequestBody OrderDetails orderDetails) {
        orderDetailsService.insert(orderDetails);
        return orderDetails;
    }

    @PostMapping("/order_details/update")
    public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderDetails) {
        orderDetailsService.update(orderDetails);
        return orderDetails;
    }
}
