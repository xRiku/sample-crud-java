package com.philipe.crudspring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.philipe.crudspring.Repository.UserRepository;
@RestController
public class UserController {
    
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String listUsers() {
        return userRepository.findAll().toString();
    }
}
