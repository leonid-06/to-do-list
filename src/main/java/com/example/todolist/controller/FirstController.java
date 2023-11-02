package com.example.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("key", "hello");
        return "hello";
    }
}
