package com.engagementForum.Forum.repository;

import com.engagementForum.Forum.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;
import java.util.List;

public interface  UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);


}
