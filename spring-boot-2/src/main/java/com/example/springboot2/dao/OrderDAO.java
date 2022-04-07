package com.example.springboot2.dao;

import com.example.springboot2.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderDAO implements DAO<OrderDAO> {
    private final OrderRepository orderRepository;

    @Override
    public Optional<OrderDAO> get(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void create(OrderDAO order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(OrderDAO order) {
        orderRepository.delete(order);
    }

    @Override
    public void update(OrderDAO order) {
        orderRepository.save(order);
    }
}