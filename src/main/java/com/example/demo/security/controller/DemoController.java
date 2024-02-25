package com.example.demo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String viewHome(){
        return "home";
    }

//    Add requiest for leaders

    @GetMapping("/leaders")
    public String showLeader(){
        return "leaders";
    }

    //    Add request for admins

    @GetMapping("/systems")
    public String showSystem(){
        return "systems";
    }
}
