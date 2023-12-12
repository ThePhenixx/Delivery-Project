package com.BlogsProject.Functions.Models;

import com.BlogsProject.Functions.Entity.Blog;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class CommentModel {

    int id;

    String text;

    String commenterId;

    int blogId;
}
