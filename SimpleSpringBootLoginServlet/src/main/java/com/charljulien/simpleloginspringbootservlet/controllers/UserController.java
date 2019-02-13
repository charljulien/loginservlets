package com.charljulien.simpleloginspringbootservlet.controllers;

import com.charljulien.simpleloginspringbootservlet.beans.User;
import com.charljulien.simpleloginspringbootservlet.exceptions.UserNotFoundException;
import com.charljulien.simpleloginspringbootservlet.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

//    //inject via application.properties
//    @Value("${welcome.message:test}")
//    private String message = "Hello World";

    @GetMapping("/login")
    public String getLogin(/*Map<String, Object> model*/) {
//        model.put("message", this.message);
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestBody User user) throws UserNotFoundException {
        user =  userServiceImpl.findByUsername(user.getUsername());
        if(user == null)
            throw new UserNotFoundException("id-" + user.getUsername());
        return "login";
    }

    @GetMapping("/home")
    public String getHome(){
        return "home";
    }

    @PostMapping("/home")
    public String postHome(){
        return "home";
    }
}
