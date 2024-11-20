package com.test.SpringSecurity.controller;

import com.test.SpringSecurity.model.Users;
import com.test.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return service.register(user);
    }
}