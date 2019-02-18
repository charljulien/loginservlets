package com.charljulien.simpleloginspringbootservlet.controllers;

import com.charljulien.simpleloginspringbootservlet.beans.User;
import com.charljulien.simpleloginspringbootservlet.exceptions.UserNotFoundException;
import com.charljulien.simpleloginspringbootservlet.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class UserController {

    @Autowired
    LoginService service;

    @GetMapping("/login")
    public String getLogin(ModelMap model) {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin (ModelMap model, @RequestParam String name, @RequestParam String password)  {
        System.out.println("****************" + name);

        boolean isValidUser = service.validateUser(name, password);

        if(!isValidUser){
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        model.put("password", password);

        return "home";

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
