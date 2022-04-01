package com.example.shopifyexposed.repositories;


import com.example.shopifyexposed.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    public List<Order> getOrderById(Integer id);
}
