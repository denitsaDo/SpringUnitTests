package com.telerikacademy.springdemo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String sayHi(){
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String sayHi2(){
        return "Hello World!!!!!";
    }

    @PostMapping
    public String sayHi1(){
        return "!";
    }
}
