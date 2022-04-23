package com.example.shopifyexposed.controllers;


import com.example.shopifyexposed.model.Order;
import com.example.shopifyexposed.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.getById(id);
    }

    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {
        orderService.insert(order);
        return order;
    }

    @PostMapping("/orders/update")
    public Order updateOrder(@RequestBody Order order) {
        orderService.update(order);
        return order;
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable Integer id){
        orderService.delete(getOrderById(id));
    }
}
