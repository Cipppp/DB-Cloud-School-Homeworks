package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.Role;
import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.service.UserService;
import com.example.unittestinghomework.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() { return ResponseEntity.ok().body(userService.getAllUsers()); }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id) { return userService.getUserById(id); }

    @PostMapping("/users/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/users/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }


    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));

    }

    @PostMapping("/role/addtouser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

    @PutMapping("/users/update")
    public User updateUserDetails(@RequestBody User user) {
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable Integer id) { userService.deleteUserById(id); }

}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}






















