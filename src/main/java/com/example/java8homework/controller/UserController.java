package com.example.java8homework.controller;

import com.example.java8homework.model.User;
import com.example.java8homework.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequiredArgsConstructor
public class UserController {
    private List<User> users;
    private UserService userService;

    @PostMapping("/initializeUsers")
    public List<User> init() {
        Stream<User> userStream = Stream.generate(User::createNewUser).limit(3);
        users = userStream.collect(Collectors.toList());
        return users;
    }

    @PostMapping("/filterUsersByAge")
    public List<User> filterUsersByAge() { return userService.filterUsersByAge(users); }

    @PostMapping("/doubleUserAge")
    public List<User> doubleUserAge() { return userService.doubleUserAge(users); };

    @PostMapping("/lastStreamElement")
    public User lastStreamElement() { return userService.lastStreamElement(users); };

    @PostMapping("/getTheYoungestUser")
    public User getTheYoungestUser(){
        return userService.getTheYoungestUser(users);
    }

    @PostMapping("/getTheOldestUser")
    public User getTheOldestUser(){
        return userService.getTheOldestUser(users);
    }

    @PostMapping("/removeDuplicateUsers")
    public List<User> removeDuplicateUsers(){
        return userService.removeDuplicateUsers(users);
    }

    @PostMapping("/filterUsers")
    public List<User> filterUsers(){
        return userService.filterUsers(users);
    }

}
