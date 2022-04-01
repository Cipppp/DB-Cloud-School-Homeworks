package com.example.shopifyexposed.repositories;


import com.example.shopifyexposed.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
    public Order getOrderById(Integer id);
}
