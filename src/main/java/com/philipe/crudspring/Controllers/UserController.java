package com.philipe.crudspring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello CRUD!";
    }
}