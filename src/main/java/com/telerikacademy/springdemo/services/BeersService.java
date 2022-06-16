package com.telerikacademy.springdemo.services;

import com.telerikacademy.springdemo.models.Beer;

import java.util.List;

public interface BeersService {
    void create(Beer beer);

    List<Beer> getAll();

    Beer getById(int id);

    void update(Beer beer);

    void delete(int id);
}
