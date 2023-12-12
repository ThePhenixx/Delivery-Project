package com.BlogsProject.Functions.Service;

import com.BlogsProject.Functions.Entity.Reaction;
import com.BlogsProject.Functions.Repository.ReactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReactionService implements GeneralService<Reaction>{

    public final ReactionRepository rr;

    @Override
    public void create(Reaction reaction) {
        rr.save(reaction);
    }

    @Override
    public void update(Reaction reaction) {
        rr.save(reaction);
    }

    @Override
    public Reaction findById(int id) {
        return rr.findById(id).get();
    }

    @Override
    public List<Reaction> finAll() {
        return rr.findAll();
    }

    @Override
    public void delete(Reaction reaction) {
        rr.delete(reaction);
    }
}
