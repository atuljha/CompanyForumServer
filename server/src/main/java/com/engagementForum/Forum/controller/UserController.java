package com.engagementForum.Forum.controller;

import com.engagementForum.Forum.models.LoginData;
import com.engagementForum.Forum.models.User;
import com.engagementForum.Forum.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@CrossOrigin(origins = "http://localhost:3002/")
@RestController
@RequestMapping("/api")
public class UserController {

    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){


        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/users/login")
    public ResponseEntity<User> loginUser(@RequestBody LoginData loginData){
        return new ResponseEntity<>(userService.login(loginData), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody User user){

        return new ResponseEntity<>(userService.save(user), HttpStatus.OK);
    }

}
