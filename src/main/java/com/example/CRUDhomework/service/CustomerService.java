package com.example.CRUDhomework.service;

import com.example.CRUDhomework.exceptions.UserExistsException;
import com.example.CRUDhomework.model.Customer;
import com.example.CRUDhomework.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer getCustomerById(Integer id) {
        return customerRepository.getById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(Integer idClient) {
        customerRepository.delete(getCustomerById(idClient));
    }

    public boolean userExists(String username) {
        return customerRepository.findCustomerByUsername(username) != null;
    }

    public void register(Customer customer) throws UserExistsException {

        if (userExists(customer.getUsername()))
            throw new UserExistsException();

        customerRepository.save(customer);

    }

    public boolean checkCredientials(String username, String password) {
        Customer customer = customerRepository.findCustomerByUsername(username);
        if (customer != null)
            return customer.getUsername().equals(username) && customer.getPassword().equals(password);
        return false;
    }

}