package com.example.java8homework.model;

import lombok.Data;

import java.util.Random;
import java.util.UUID;

@Data // sau puteam sa ne chinuim cu settere si gettere
public class User {
    private int id;
    private int age;
    private String name;
    private static int counter;

    public static User createNewUser() {
        User newUser = new User();

        UUID uuid = UUID.randomUUID();
        newUser.name = uuid.toString();

        Random random = new Random();
        newUser.age = random.nextInt(100);

        newUser.id = counter;
        counter++;

        return newUser;
    }
}