package com.example.shopifyexposed.repositories;


import com.example.shopifyexposed.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
//    public Customer getCustomerById(Integer id);
}
