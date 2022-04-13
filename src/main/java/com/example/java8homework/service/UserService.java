package com.example.java8homework.service;

import com.example.java8homework.model.User;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {
    public List<User> filterUsersByAge(List<User> users) {
        Stream<User> stream = users.stream();
        return stream.filter((x) -> x.getAge() < 18).collect(Collectors.toList());
    }

    public List<User> doubleUserAge(List<User> users) {
        Stream <User> stream = users.stream();
        return stream.map((x) -> {
            x.setAge(x.getAge() * 2);
            return x;
        }).collect(Collectors.toList());
    }

    public User lastStreamElement(List<User> users) {
        Stream<User> stream = users.stream();
        return stream.reduce((first, second) -> second).get();
    }

    public List<User> sortUsersByAge(List<User> users) {
        Stream<User> stream = users.stream();
        return stream.sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        }).collect(Collectors.toList());
    }

    public User getTheYoungestUser(List<User> users) {
        return sortUsersByAge(users).stream().findFirst().get();
    }

    public User getTheOldestUser(List<User> users) {
        return sortUsersByAge(users).stream().reduce((first, second) -> second).get();
    }

    public List<User> removeDuplicateUsers(List<User> users) {
        return users.stream().distinct().collect(Collectors.toList());
    }

    public List<User> filterUsers(List<User> users) {
        return sortUsersByAge(users.stream().filter((x) -> x.getAge() > 30).map((x) -> {
            x.setName(x.getName().toUpperCase());
            return x;
        }).collect(Collectors.toList()));
    }
}
