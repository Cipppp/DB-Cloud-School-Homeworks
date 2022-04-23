package com.example.springboot2.repository;

import com.example.springboot2.dao.CustomerDAO;
import com.example.springboot2.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository <CustomerDAO, Integer>{
    public List<Customer> findByUsername(String name);
    public List<Customer> findByCity(String city);
    public List<Customer> findByCountry(String country);
}