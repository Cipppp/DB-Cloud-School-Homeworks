package com.example.springboot2.dto;

import com.example.springboot2.repository.CustomerRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Data
public class CustomerDTO {
    private String username;
    private String city;
    private String country;
}
