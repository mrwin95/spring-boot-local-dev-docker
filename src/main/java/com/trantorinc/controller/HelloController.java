package com.trantorinc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trantorinc.models.*;
@RestController
public class HelloController {
    
    @GetMapping("/app")

    public String getApplicationName(){
        return "Application api call successfully";
    }

    @GetMapping("/users")
    public User getUsers(){
        User user = new User(10L, "Win");

        return user;
    }
}
