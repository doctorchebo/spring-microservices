package com.marcelo_rest_service.rest_services.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
