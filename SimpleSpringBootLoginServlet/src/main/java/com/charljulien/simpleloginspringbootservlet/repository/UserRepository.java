package com.charljulien.simpleloginspringbootservlet.repository;

import com.charljulien.simpleloginspringbootservlet.beans.User;

public interface UserRepository  {
    User findByUsername(String username);
}
