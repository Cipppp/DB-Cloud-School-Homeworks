package com.example.swaggerhw.respository;

import com.example.swaggerhw.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
