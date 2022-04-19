package com.engagementForum.Forum.services;

import com.engagementForum.Forum.models.LoginData;
import com.engagementForum.Forum.models.User;
import com.engagementForum.Forum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public  User login(LoginData loginData){
         User user = userRepository.findByEmail(loginData.email);
         return user;
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach((user)-> users.add(user) );
        return users;
    }

    public User save(User user) {
       return  userRepository.save(user);
    }
}
