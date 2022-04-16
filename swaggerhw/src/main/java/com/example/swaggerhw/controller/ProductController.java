package com.example.swaggerhw.controller;

import com.example.swaggerhw.exceptions.PageNotFoundException;
import com.example.swaggerhw.model.PaymentMethod;
import com.example.swaggerhw.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

@Profile("product")
public class ProductController {
    @Autowired
    Service service;
    @PostMapping("/product")
    public String pay(@RequestBody Long customerId, @RequestBody Long orderId, @RequestBody PaymentMethod paymentMethod) {
            return service.pay(customerId, orderId, paymentMethod);
    }
}
