package com.BlogsProject.Functions.Controller;

import com.BlogsProject.Functions.Entity.Blog;
import com.BlogsProject.Functions.Models.*;
import com.BlogsProject.Functions.Service.BlogService;
import com.BlogsProject.Functions.Service.GroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/blogController")
public class BlogController {

    private final ModelsServices brs;
    private final BlogService bs;

    @PostMapping("/create-blog")
    public void createBlog(@RequestBody BlogRequestEntity bg){
        brs.saveBlog(bg);
    }

    @PostMapping("/update-blog")
    public void updateBlogInformation(@RequestBody BlogUpdateEntity bg){
        brs.updateBlogInformation(bg);
    }

    @GetMapping("/get-blogs/{page}/{pageSize}")
    public Page<Blog> findBlogs(@PathVariable("page") int page, @PathVariable("pageSize") int pageSize){
        return bs.findAll(page, pageSize);
    }

    @GetMapping("/find-blogs-by-user/{id}/{page}/{pageSize}")
    public Page<Blog> findBlogsByUser(@PathVariable("id") String id, @PathVariable("page") int page, @PathVariable("pageSize") int pageSize){
        return bs.findBlogsByUser(id, page, pageSize);
    }


















}
