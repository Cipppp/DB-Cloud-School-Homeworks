package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() { return userService.getAllUsers(); }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id) { return userService.getUserById(id); }

    @PostMapping("/users")
    public void createUser(@RequestBody User user) { userService.insertUser(user); }

    @PostMapping("/users/update")
    public User updateUserDetails(@RequestBody User user) {
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable Integer id) { userService.deleteUserById(id); }

    @GetMapping("/users/sorted")
    public List<User> getUsersSorted(List<User> users) { return userService.compareByNumberOfOrders(users); }
}
