package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String home1() {
        return "home";
    }
    
    @GetMapping("/register")
    public String register() {
    	System.out.println("###REGISTER###");
        return "register";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/login")
    public String login() {
    	System.out.println("###LOGIN###");
        return "login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
