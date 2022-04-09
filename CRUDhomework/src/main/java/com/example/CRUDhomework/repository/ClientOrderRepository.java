package com.example.CRUDhomework.repository;

import com.example.CRUDhomework.model.ClientOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientOrderRepository extends JpaRepository<ClientOrder, Integer> {

}
