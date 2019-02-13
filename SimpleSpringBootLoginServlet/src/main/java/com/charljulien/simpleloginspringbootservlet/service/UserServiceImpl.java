package com.charljulien.simpleloginspringbootservlet.service;

import com.charljulien.simpleloginspringbootservlet.beans.User;
import com.charljulien.simpleloginspringbootservlet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "username1", "password"));
        users.add(new User(2, "username2", "password"));
        users.add(new User(3, "username3", "password"));
    }

    @Override
    public void save(User user) {
        //TO DO
    }

    @Override
    public User findByUsername(String username) {
        for(User user: users){
            if(user.getUsername() == username){
                return user;
            }
        }
        return null;
    }
}
