package com.INDEED.SERVER.controller;

import com.INDEED.SERVER.constants.APIConstants;
import com.INDEED.SERVER.dto.PostDTO;
import com.INDEED.SERVER.model.PostModal;
import com.INDEED.SERVER.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = {"https://indeed-railway-ce0qwroyb-taruns-projects-e8d11d94.vercel.app", "http://localhost:3000"})
public class PostController {

    final PostService postService;

    @PostMapping(APIConstants.SAVE_POST)
    public PostModal savePost(@Valid @RequestBody PostDTO postDTORequest){
        log.info("Saving post #####");

        return this.postService.savePost(postDTORequest);
    }

    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModal> getAllPosts(){
        log.info("getting all post ###");
        return this.postService.getAllPosts();
    }


}
