package com.example.springboot2;

import com.example.springboot2.models.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2Application.class, args);
		Customer customer = Customer.builder().id(1).city("Bucharest").username("Username").country("Romania").build();
	}

}
