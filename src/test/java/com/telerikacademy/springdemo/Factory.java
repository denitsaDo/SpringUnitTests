package com.telerikacademy.springdemo;

import com.telerikacademy.springdemo.models.Beer;

public class Factory {

    public static Beer createBeer() {

        return new Beer(1, "testBeer", 1.1);
    }
}
