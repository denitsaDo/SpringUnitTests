package com.telerikacademy.springdemo.services;

import com.telerikacademy.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.springdemo.models.Beer;
import com.telerikacademy.springdemo.repositories.BeersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeersServiceImpl implements BeersService {
    
    private BeersRepository repository;
    
    @Autowired
    public BeersServiceImpl(BeersRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public Beer getById(int id) {
        return repository.getById(id);
    }
    
    @Override
    public void create(Beer beer) {
        if (repository.checkBeerExists(beer.getName())) {
            throw new DuplicateEntityException(
                    String.format("Beer with name %s already exists", beer.getName())
            );
        }
        repository.create(beer);
    }
    
    @Override
    public List<Beer> getAll() {
        return repository.getAll();
    }
    
    @Override
    public void update(Beer beer) {
        repository.update(beer);
    }
    
    @Override
    public void delete(int id) {
        repository.delete(id);
    }
    
}
