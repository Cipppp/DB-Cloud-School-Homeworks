package com.example.springboot2.controller;

import com.example.springboot2.models.Customer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @GetMapping("/view")
    public ModelAndView allCustomersView(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"BestJohn","Bucharest","Romania"));
        customers.add(new Customer(2,"BestTrainerRusuDinu","Bucharest","Romania"));
        customers.add(new Customer(3,"BestTrainerAlexHang","Bucharest","Romania"));
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView CustomersById(Integer id){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"BestJohn","Bucharest","Romania"));
        customers.add(new Customer(2,"BestTrainerRusuDinu","Bucharest","Romania"));
        customers.add(new Customer(3,"BestTrainerAlexHang","Bucharest","Romania"));
        for(Customer customer: customers){
            if(customer.getId() != id)
                customers.remove(customer);
        }w
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{username}")
    public ModelAndView CustomersByUsername(String username){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"BestJohn","Bucharest","Romania"));
        customers.add(new Customer(2,"BestTrainerRusuDinu","Bucharest","Romania"));
        customers.add(new Customer(3,"BestTrainerAlexHang","Bucharest","Romania"));
        for(Customer customer: customers){
            if(customer.getUsername() != username)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{country}")
    public ModelAndView CustomersByCountry(String country){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"BestJohn","Bucharest","Romania"));
        customers.add(new Customer(2,"BestTrainerRusuDinu","Bucharest","Romania"));
        customers.add(new Customer(3,"BestTrainerAlexHang","Bucharest","Romania"));
        for(Customer customer: customers){
            if(customer.getCountry() != country)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{city}")
    public ModelAndView CustomersByCity(String city){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"BestJohn","Bucharest","Romania"));
        customers.add(new Customer(2,"BestTrainerRusuDinu","Bucharest","Romania"));
        customers.add(new Customer(3,"BestTrainerAlexHang","Bucharest","Romania"));
        for(Customer customer: customers){
            if(customer.getCity() != city)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}