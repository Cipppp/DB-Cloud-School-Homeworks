package com.example.CRUDhomework.service;

import com.example.CRUDhomework.model.Product;
import com.example.CRUDhomework.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product getProductById(Integer id){
        return productRepository.getById(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void addProduct(Product product)
    {
        productRepository.save(product);
    }

    public void removeProduct(Product product){
        productRepository.delete(product);
    }





}
