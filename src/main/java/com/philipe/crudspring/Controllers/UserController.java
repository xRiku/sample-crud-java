package com.philipe.crudspring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.philipe.crudspring.Models.User;
import com.philipe.crudspring.Repository.UserRepository;
@RestController
public class UserController {
    
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "Hello\nAccess /user to list all users ";
    }

    @GetMapping("/user")
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User added";
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user) {
        User userToUpdate = userRepository.findById(id).get();
        System.out.println(user.getFirstName());
        if (user.getFirstName() != null) {
            userToUpdate.setFirstName(user.getFirstName());
        }
        if (user.getLastName() != null) {
            userToUpdate.setLastName(user.getLastName());
        }
        if (user.getAge() != 0) {
            userToUpdate.setAge(user.getAge());
        }
        userRepository.save(userToUpdate);

        return "User updated";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable long id) {
        userRepository.deleteById(id);
        return "User deleted";
    }

    @DeleteMapping("/user/all")
    public String deleteAll() {
        userRepository.deleteAll();
        return "All users deleted";
    }
}
