package com.charljulien.simpleloginspringbootservlet.service;

import com.charljulien.simpleloginspringbootservlet.beans.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
