package com.telerikacademy.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bye")
public class ByeController {

    @GetMapping
    public String sayBye(){
        return "Bye World!";
    }
}
