package com.engagementForum.Forum.repository;

import com.engagementForum.Forum.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
