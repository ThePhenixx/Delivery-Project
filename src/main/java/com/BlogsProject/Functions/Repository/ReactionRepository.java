package com.BlogsProject.Functions.Repository;

import com.BlogsProject.Functions.Entity.Reaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReactionRepository extends JpaRepository<Reaction, Integer> {
}
