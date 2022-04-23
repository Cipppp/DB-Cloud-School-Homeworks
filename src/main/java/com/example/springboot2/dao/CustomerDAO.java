package com.example.springboot2.dao;

import com.example.springboot2.models.Customer;
import com.example.springboot2.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerDAO implements DAO<CustomerDAO> {
    private final CustomerRepository customerRepository;

    @Override
    public Optional<CustomerDAO> get(Integer id) {
        return customerRepository.findById(id);
    }

    public List<Customer> getAll() {
        List <Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    @Override
    public void create(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(CustomerDAO customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void update(CustomerDAO customer) {
        customerRepository.save(customer);
    }

    public List<Customer> filterCity(String city){
        return customerRepository.findByCity(city);
    }

    public List<Customer> filterUsername(String username){
        return customerRepository.findByUsername(username);
    }

    public List<Customer> filterCountry(String country){
        return customerRepository.findByCountry(country);
    }
}