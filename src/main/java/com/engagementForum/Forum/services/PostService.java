package com.engagementForum.Forum.services;

import com.engagementForum.Forum.models.Post;
import com.engagementForum.Forum.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class PostService {
    
    @Autowired
    PostRepository postRepository;
    
   public  List<Post> getAllPosts(){
        List<Post> posts = postRepository.findAll().stream().sorted(Comparator.comparing(Post::getCreatedAt).reversed()).toList();
        return posts ;
    }

    public Post savePost(Post post){
      return  postRepository.save(post);
    }

    public Post createPost(Post post) {
       post.setComments(new ArrayList<>());
       post.setLikes(0);
       post.setCreatedAt(new Date());
       return postRepository.save(post);

    }
}


