package com.telerikacademy.springdemo;

import com.telerikacademy.springdemo.repositories.BeersRepository;
import com.telerikacademy.springdemo.repositories.BeersRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
