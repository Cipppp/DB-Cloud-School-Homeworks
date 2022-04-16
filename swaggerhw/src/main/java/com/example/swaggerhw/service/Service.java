package com.example.swaggerhw.service;

import com.example.swaggerhw.exceptions.PageNotFoundException;
import com.example.swaggerhw.model.PaymentMethod;
import com.example.swaggerhw.respository.CustomerRepository;
import com.example.swaggerhw.respository.OrderRepository;
import com.example.swaggerhw.respository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class Service {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    PaymentRepository paymentRepository;

    public String pay(Long cusomterId, Long orderId, PaymentMethod paymentMethod) {
            if (orderRepository.getById(orderId).getPrice() < 10000.0)
                return "Customer with id: " + customerRepository.getById(cusomterId) + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + paymentMethod;
            else if(paymentMethod != PaymentMethod.CARD)
                return "Invalid payment method!";


        return "Customer with id: " + customerRepository.getById(cusomterId) + " payed: " + orderRepository.getById(orderId).getPrice() + "with: " + PaymentMethod.CARD;
    }
}
