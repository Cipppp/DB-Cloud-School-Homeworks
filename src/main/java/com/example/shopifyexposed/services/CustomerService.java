package com.example.shopifyexposed.services;

import com.example.shopifyexposed.model.Customer;
import com.example.shopifyexposed.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    //public Customer getCustomerById(Integer id) { return customerRepository.getCustomerById(id); }
    // or this way
    public Customer getById(Integer id) {
    return customerRepository.findById(id).get();
}

    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(customers::add);
        return customers;
    }

    public Customer insert(Customer customer) {
        return customerRepository.save(customer);
    }

    public void update(Customer customer) {
        customerRepository.save(customer);
    }

//    public void delete(Customer customer) {
//        customerRepository.delete(customer);
//    }

    public void deleteCustomerById(@PathVariable Integer id) { customerRepository.deleteById(id); }
}
