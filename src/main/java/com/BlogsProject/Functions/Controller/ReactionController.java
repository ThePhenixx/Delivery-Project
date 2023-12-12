package com.BlogsProject.Functions.Controller;

import com.BlogsProject.Functions.Models.ModelsServices;
import com.BlogsProject.Functions.Models.ReactionModel;
import com.BlogsProject.Functions.Service.ReactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/reactionController")
public class ReactionController {

    private final ModelsServices ms;
    private final ReactionService rs;

    @PostMapping("/create-reaction")
    public void AddReaction(@RequestBody ReactionModel rm){
        ms.addReaction(rm);
    }

    @GetMapping("/delete-reaction/{id}")
    public void deleteReaction(@PathVariable("id") int id){
        rs.delete(rs.findById(id));
    }
}
