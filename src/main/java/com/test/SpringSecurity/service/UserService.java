package com.test.SpringSecurity.service;

import com.test.SpringSecurity.model.Users;
import com.test.SpringSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    public Users register(Users user){
        return repo.save(user);
    }
}
