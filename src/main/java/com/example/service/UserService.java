package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.api.model.User;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Pinter Erik Robert", 24, "erikpinter15@gmail.com", 204439867, "Erik20000116");
        User user2 = new User(2, "Pinter Robertne", 42, "erikpinter15@gmail.com", 204439867, "Erik20000116");
        User user3 = new User(3, "Pinter Erik Robert", 24, "erikpinter15@gmail.com", 204439867, "Erik20000116");
        User user4 = new User(4, "Pinter Erik Robert", 24, "erikpinter15@gmail.com", 204439867, "Erik20000116");
        User user5 = new User(5, "Pinter Erik Robert", 24, "erikpinter15@gmail.com", 204439867, "Erik20000116");
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
