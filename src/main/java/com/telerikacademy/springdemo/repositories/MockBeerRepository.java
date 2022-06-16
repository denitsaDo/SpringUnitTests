package com.telerikacademy.springdemo.repositories;

import com.telerikacademy.springdemo.models.Beer;

import java.util.List;

public class MockBeerRepository implements BeersRepository {
    
    @Override
    public void create(Beer beer) {
    
    }
    
    @Override
    public List<Beer> getAll() {
        return null;
    }
    
    @Override
    public Beer getById(int id) {
        return null;
    }
    
    @Override
    public boolean checkBeerExists(String name) {
        return false;
    }
    
    @Override
    public void update(Beer beer) {
    
    }
    
    @Override
    public void delete(int id) {
    
    }
    
}
