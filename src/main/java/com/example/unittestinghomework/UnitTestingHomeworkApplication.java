package com.example.unittestinghomework;

import com.example.unittestinghomework.model.*;
import com.example.unittestinghomework.repository.RoleRepository;
import com.example.unittestinghomework.repository.UserRepository;
import com.example.unittestinghomework.service.RoleServiceImpl;
import com.example.unittestinghomework.service.UserService;
import com.example.unittestinghomework.service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@SpringBootApplication
public class UnitTestingHomeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitTestingHomeworkApplication.class, args);
	}


	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(UserServiceImpl userService, UserRepository userRepository, RoleRepository roleRepository, RoleServiceImpl roleServiceRepository) {
		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "John", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "Ran", "1234", new ArrayList<>()));
//			userService.saveUser(new User(null, "ben", "1234", new ArrayList<>()));

			userService.addRoleToUser("John", "ROLE_USER");
			System.out.println(userService.getAllUsers());;
			userService.addRoleToUser("Ran", "ROLE_MANAGER");
			userService.addRoleToUser("Ran", "ROLE_ADMIN");





		};
	}


}
