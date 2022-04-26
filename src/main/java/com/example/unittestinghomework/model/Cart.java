package com.example.unittestinghomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer price;

    private Integer numberOfProducts;

    @OneToMany
    private List<Product> productsList;

    @OneToMany
    private List<User> userList;


    public void addProduct(Product product) { productsList.add(product); }

    public void removeProduct(Product product) {
        productsList.remove(product);
    }
}
