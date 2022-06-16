package com.telerikacademy.springdemo.repositories;

import com.telerikacademy.springdemo.models.Beer;

import java.util.List;

public interface BeersRepository {
    void create(Beer beer);

    List<Beer> getAll();

    Beer getById(int id);

    boolean checkBeerExists(String name);

    void update(Beer beer);

    void delete(int id);
}
