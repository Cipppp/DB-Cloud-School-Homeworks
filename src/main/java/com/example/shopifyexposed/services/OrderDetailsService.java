package com.example.shopifyexposed.services;


import com.example.shopifyexposed.model.OrderDetails;
import com.example.shopifyexposed.repositories.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderDetailsService {
    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    public OrderDetails getOrderDetailsById(Integer id) { return orderDetailsRepository.getOrderDetailsById(id); }

    public List<OrderDetails> getAllOrderDetails() {
        List<OrderDetails> orderDetails = new ArrayList<>();
        orderDetailsRepository.findAll().iterator().forEachRemaining(orderDetails::add);
        return orderDetails;
    }

    public void insert(OrderDetails orderDetails) {
        orderDetailsRepository.save(orderDetails);
    }

    public void update(OrderDetails orderDetails) { orderDetailsRepository.save(orderDetails); }

    public void delete(OrderDetails orderDetails) {
        orderDetailsRepository.delete(orderDetails);
    }
}
