package com.example.onlinebookstore.exceptions.user;

public class UserRegisterException extends RuntimeException {

    public UserRegisterException(String errorMessage) {
        super(errorMessage);
    }
}