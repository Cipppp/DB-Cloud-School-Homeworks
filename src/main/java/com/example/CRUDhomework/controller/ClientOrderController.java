package com.example.CRUDhomework.controller;


import com.example.CRUDhomework.model.ClientOrder;
import com.example.CRUDhomework.model.Product;
import com.example.CRUDhomework.repository.ClientOrderRepository;
import com.example.CRUDhomework.service.ClientOrderService;
import com.example.CRUDhomework.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class ClientOrderController {

    private final ClientOrderService clientOrderService;
    private final ClientOrderRepository clientOrderRepository;
    private final ProductService productService;

    @GetMapping("/orders")
    public List<ClientOrder> getAllClientOrders(){
        return clientOrderService.getAllClientsOrders();
    }

    @GetMapping("/orders/{id}")
    public ClientOrder getOrderById(@PathVariable Integer id){
        return clientOrderService.getClientOrderById(id);
    }

    @PostMapping("/orders/add")
    public void createNewOrder(@RequestBody ClientOrder clientOrder)
    {
        clientOrderService.addClientOrder(clientOrder);
    }

    @DeleteMapping("/orders/delete/{id}")
    public void deleteOrder(@PathVariable Integer id){
        clientOrderService.deleteClientOrder( clientOrderService.getClientOrderById(id) );
    }

    @PostMapping("/orders/add/{id}")
    public void addNewProduct(@PathVariable Integer id, @RequestBody Product p){
        ClientOrder clientOrder = getOrderById(id);
        clientOrder.addProduct(p);
        clientOrderRepository.save(clientOrder);
    }

    @PostMapping("/orders/{id}/{idProduct}")
    public void removeProduct(@PathVariable Integer id, @PathVariable Integer idProduct){
        ClientOrder clientOrder = getOrderById(id);

        Product product = productService.getProductById(idProduct);

        clientOrder.removeProduct(product);
        clientOrderRepository.save(clientOrder);
    }

}
