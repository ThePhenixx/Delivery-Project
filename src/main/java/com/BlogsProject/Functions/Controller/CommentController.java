package com.BlogsProject.Functions.Controller;


import com.BlogsProject.Functions.Models.CommentModel;
import com.BlogsProject.Functions.Models.ModelsServices;
import com.BlogsProject.Functions.Service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/commentController")
public class CommentController {

    private final ModelsServices brs;
    private final CommentService cs;

    @PostMapping("/create-comment")
    public void addComment(@RequestBody CommentModel cm){
        brs.addComment(cm);
    }

    @GetMapping ("/delete-comment/{id}")
    public void deleteComment(@PathVariable("id") int id){
        cs.delete(cs.findById(id));
    }


}
