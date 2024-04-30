package org.bytetech.joblisting.controller;

import org.bytetech.joblisting.model.Post;
import org.bytetech.joblisting.repository.PostRepository;
import org.bytetech.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/posts")
    @CrossOrigin
    public List<Post> getAllPost() {
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text) {
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post p){
        return repo.save(p);
    }

}
