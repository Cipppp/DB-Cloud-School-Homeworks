package com.example.springboot2.repository;


import com.example.springboot2.dao.OrderDAO;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <OrderDAO, Integer> {
}
