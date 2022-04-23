package com.example.CRUDhomework.repository;

import com.example.CRUDhomework.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
