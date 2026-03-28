package com.studing.latanks.me.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel user) {
        var existingUser = this.userRepository.findByUsername(user.getUsername());
        if (existingUser != null) {
            System.out.println("User already exists with username: " + user.getUsername());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists"); // Or throw an exception, or return a specific response indicating the user already
        }
        var userCreated = this.userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
