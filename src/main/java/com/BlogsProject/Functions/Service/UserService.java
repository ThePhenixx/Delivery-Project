package com.BlogsProject.Functions.Service;

import com.BlogsProject.Authentication.Entity.User;
import com.BlogsProject.Authentication.Entity.UserRepository;
import com.BlogsProject.Functions.Entity.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository ur;

    public List<UserModel> findUsersByNameDebut(String debut, int page, int pageSize){
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<User> pg =ur.findUserByNameDebut(debut, pageable);
        List<User> list = pg.getContent();
        List<UserModel> outputList = new ArrayList<>();
        for(User user: list){
            UserModel um = UserModel.builder()
                    .firstname(user.getFirstname())
                    .lastname(user.getLastname())
                    .profilDescription(user.getProfilDescription())
                    .build();
            outputList.add(um);
        }
        return outputList;
    }
}
