package com.example.springboot2.repository;

import com.example.springboot2.dao.CustomerDAO;
import com.example.springboot2.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <CustomerDAO, Integer>{
    Iterable<Customer> getAllByUsername(String username);
    Iterable<Customer> getAllByCity(String city);
    Iterable<Customer> getAllByCountry(String country);
}
