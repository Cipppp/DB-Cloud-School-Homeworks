package com.example.shopifyexposed.controllers;

import com.example.shopifyexposed.model.Customer;
import com.example.shopifyexposed.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() { return customerService.getAllCustomers(); }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Integer id) { return customerService.getCustomerById(id); }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        customerService.insert(customer);
        return customer;
    }

    @PostMapping("/customers/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        customerService.update(customer);
        return customer;
    }

}
