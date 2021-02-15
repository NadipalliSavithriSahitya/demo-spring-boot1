package com.ass.demospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping("/Hello")
    public String sayHi(){
        return "sup Sahitya?";
    }
    @GetMapping("/")
    public String home() {
        return "This is Home page";

        }
    }

