package com.example.CRUDhomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clients_orders")
@AllArgsConstructor
@NoArgsConstructor
public class ClientOrder {

    @Id
    @GeneratedValue
    private Integer id;
    private String shipDate;
    private Integer idClient;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    @ManyToOne
    private Customer customer;

    @OneToMany
    private List<Product> products;

    public void addProduct(Product p){
        products.add(p);
    }

    public void removeProduct(Product p){
        products.remove(p);
    }

}
