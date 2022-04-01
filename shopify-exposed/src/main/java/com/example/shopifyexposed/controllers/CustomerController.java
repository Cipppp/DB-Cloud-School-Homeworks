package com.example.shopifyexposed.controllers;

import com.example.shopifyexposed.dto.CustomerDTO;
import com.example.shopifyexposed.model.Customer;
import com.example.shopifyexposed.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() { return customerService.getAllCustomers(); }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Integer id) { return customerService.getById(id); }

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

    @PostMapping("/customers-dto")
    public Customer createCustomerDTO(@RequestBody CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getName(), customerDTO.getOrders());
        return customerService.insert(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@RequestBody Integer id){
        customerService.deleteCustomerById(id);
    }

}
