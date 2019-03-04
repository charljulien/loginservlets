package com.charljulien.simpleloginspringbootservlet.controllers;

import com.charljulien.simpleloginspringbootservlet.beans.User;
import com.charljulien.simpleloginspringbootservlet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class UserController {

    @Autowired
    LoginService service;

    @GetMapping("/login")
    public User getLogin() {
        // Do something
        User user = new User();
        return user;
    }

    @PostMapping("/login")
    public User postLogin (@RequestBody User user)  {
        boolean isValidUser = service.validateUser(user.getUsername(), user.getPassword());

        if (isValidUser){
            System.out.println("user " + user + " logged in");
            return user;
        }
        else{
            System.out.println("erreur");
            return null;
        }
    }

//    @GetMapping("/home")
//    public String getHome(ModelMap model){
//        return "home";
//    }
//
//    @PostMapping("/home")
//    public String postHome(ModelMap model){
//        return "home";
//    }
}
