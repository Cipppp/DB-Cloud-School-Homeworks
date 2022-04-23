package com.example.CRUDhomework.repository;

import com.example.CRUDhomework.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer findCustomerByUsername(String username);
}
