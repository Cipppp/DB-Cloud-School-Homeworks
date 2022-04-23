package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserById(Integer id) { return userRepository.getById(id); }

    public List<User> getAllUsers() { return userRepository.findAll(); }

    public void insertUser(User user) { userRepository.save(user); }

    public void removeUser(User user) { userRepository.delete(user); }

    public void deleteUserById(Integer id) { userRepository.delete(getUserById(id)); }

    public void updateUser(User user) { userRepository.save(user); }

    public List<User> compareByNumberOfOrders(List<User> users)
    {
        Stream<User> stream =  users.stream();
        return stream.sorted(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getNumberOfOrders() - o2.getNumberOfOrders();
            }
        }).collect(Collectors.toList());
    }

}
