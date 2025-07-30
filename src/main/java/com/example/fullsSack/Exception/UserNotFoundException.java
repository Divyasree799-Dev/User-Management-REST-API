package com.example.fullsSack.Exception;


import org.springframework.web.bind.annotation.ControllerAdvice;


public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user "+id);

    }
}
