package com.example.CRUDhomework.service;

import com.example.CRUDhomework.exceptions.UserAlreadyExistException;
import com.example.CRUDhomework.model.Customer;
import com.example.CRUDhomework.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer getCustomerById(Integer id) {
        return customerRepository.getById(id);
    }

    public void deleteCustomer(Integer idClient) {
        customerRepository.delete(getCustomerById(idClient));
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public boolean checkIfUserExist(String username) {
        return customerRepository.findCustomerByUsername(username) != null;
    }

    public void register(Customer customer) throws UserAlreadyExistException {

        if (checkIfUserExist(customer.getUsername()))
            throw new UserAlreadyExistException();

        customerRepository.save(customer);

    }

    public boolean checkCredientials(String username, String password) {
        Customer c = customerRepository.findCustomerByUsername(username);
        if (c != null)
            return c.getUsername().equals(username) && c.getPassword().equals(password);
        return false;
    }

}