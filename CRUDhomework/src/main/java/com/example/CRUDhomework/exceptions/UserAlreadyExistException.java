package com.example.CRUDhomework.exceptions;

public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(){
        super("User already exist with this username");
    }
}
