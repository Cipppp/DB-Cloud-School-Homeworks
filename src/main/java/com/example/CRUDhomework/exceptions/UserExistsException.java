package com.example.CRUDhomework.exceptions;

public class UserExistsException extends Exception{
    public UserExistsException(){
        super("User already exist with this username");
    }
}
