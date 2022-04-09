package com.example.CRUDhomework.controller;

import com.example.CRUDhomework.model.Product;
import com.example.CRUDhomework.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/products/add")
    public void addNewProduct(@RequestBody Product p) {
        productService.addProduct(p);
    }

    @DeleteMapping("/products/delete/{id}")
    public void removeProduct(@PathVariable Integer id) {
        productService.removeProduct(getProductById(id));
    }

}
