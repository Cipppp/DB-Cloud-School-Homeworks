package com.example.springboot2.controller;

import com.example.springboot2.dao.CustomerDAO;
import com.example.springboot2.models.Customer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    CustomerDAO customerDAO;

    @GetMapping("/filterCity")
    public List<Customer> filterCity(@RequestParam ("city") String city){
        return customerDAO.filterCity(city);
    }
    @GetMapping("/filterCountry")
    public List<Customer> filterCountry(@RequestParam ("country") String country){
        return customerDAO.filterCountry(country);
    }

    @GetMapping("/view")
    public ModelAndView displayView(){
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "abc", "Bucharest", "Romania"));
        customers.add(new Customer(1, "bcd", "Ploiesti", "Romania"));
        customers.add(new Customer(1, "cde", "Constanta", "Romania"));

        ModelAndView modelAndView = new ModelAndView("view-pages");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @PostMapping("/customers")
    public void addCustomer(@RequestBody CustomerDAO customer)
    {
        customerDAO.create(customer);
    }
}