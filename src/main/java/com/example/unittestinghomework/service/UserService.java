package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.Role;
import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.repository.RoleRepository;
import com.example.unittestinghomework.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface UserService  {

    User saveUser(User user);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

//    List<User> getUsers();

}

