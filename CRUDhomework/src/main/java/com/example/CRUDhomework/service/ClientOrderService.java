package com.example.CRUDhomework.service;

import com.example.CRUDhomework.model.ClientOrder;
import com.example.CRUDhomework.repository.ClientOrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientOrderService {
    private final ClientOrderRepository clientOrderRepository;

    public ClientOrder getClientOrderById(Integer id)
    {
        return clientOrderRepository.getById(id);
    }

    public void addClientOrder(ClientOrder clientOrder)
    {
        clientOrderRepository.save(clientOrder);
    }

    public void deleteClientOrder(ClientOrder clientOrder)
    {
        clientOrderRepository.delete(clientOrder);
    }

    public List<ClientOrder> getAllClientsOrders()
    {
        return clientOrderRepository.findAll();
    }
}
