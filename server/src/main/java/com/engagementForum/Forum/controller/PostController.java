package com.engagementForum.Forum.controller;

import com.engagementForum.Forum.models.Post;
import com.engagementForum.Forum.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3002/")
@RestController
@RequestMapping("api/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    ResponseEntity<List<Post>> getAllPosts(){
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    ResponseEntity<Post> updatePost(@PathVariable("id") String id, @RequestBody Post post){
        post.set_id(id);
        return new ResponseEntity<>(postService.savePost(post), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Post> createPost(@RequestBody Post post){

        return  new ResponseEntity<Post>(postService.createPost(post), HttpStatus.OK);
    }
}
