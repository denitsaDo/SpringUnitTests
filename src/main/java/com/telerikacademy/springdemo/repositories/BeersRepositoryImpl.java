package com.telerikacademy.springdemo.repositories;

import com.telerikacademy.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.springdemo.models.Beer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BeersRepositoryImpl implements BeersRepository {
    private List<Beer> beers;

    public BeersRepositoryImpl() {
        beers = new ArrayList<>();
        beers.add(new Beer(1, "Glarus Pale Ale", 4.7));
        beers.add(new Beer(2, "Pirinsko", 4.2));
        beers.add(new Beer(3, "Rhombus", 13.2));
    }

    @Override
    public void create(Beer beer) {
        beers.add(beer);
    }

    @Override
    public List<Beer> getAll() {
        return beers;
    }

    @Override
    public Beer getById(int id) {
        return beers.stream()
                .filter(beer -> beer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format("Beer with id %d not found", id)));
    }

    @Override
    public boolean checkBeerExists(String name) {
        return beers.stream()
                .anyMatch(beer -> beer.getName().equals(name));
    }

    @Override
    public void update(Beer beer) {
        Beer beerToUpdate = getById(beer.getId());
        beerToUpdate.setName(beer.getName());
        beerToUpdate.setAbv(beer.getAbv());
    }

    @Override
    public void delete(int id) {
        Beer beerToDelete = getById(id);
        beers.remove(beerToDelete);
    }
}
