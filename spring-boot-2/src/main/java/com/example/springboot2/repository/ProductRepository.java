package com.example.springboot2.repository;


import com.example.springboot2.dao.ProductDAO;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductDAO,Integer> {
}
