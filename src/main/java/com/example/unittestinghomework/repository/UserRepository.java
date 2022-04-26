package com.example.unittestinghomework.repository;

import com.example.unittestinghomework.model.Role;
import com.example.unittestinghomework.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}



















