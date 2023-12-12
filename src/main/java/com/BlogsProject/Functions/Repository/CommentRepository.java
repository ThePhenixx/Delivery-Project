package com.BlogsProject.Functions.Repository;

import com.BlogsProject.Functions.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
