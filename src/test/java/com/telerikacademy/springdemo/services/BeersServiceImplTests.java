package com.telerikacademy.springdemo.services;

import com.telerikacademy.springdemo.models.Beer;
import com.telerikacademy.springdemo.repositories.BeersRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BeersServiceImplTests {

    @Test
    public void getByIdShould_ReturnBeer_WhenBeerExists() {
        //Arrange
        BeersRepository repository = Mockito.mock(BeersRepository.class);
        BeersService mockService = new BeersServiceImpl(repository);
        Mockito.when(repository.getById(1))
                .thenReturn(new Beer(1, "testBeer", 1.1));
        //Act
        Beer returnedBeer = mockService.getById(1);

        //Assert
        Assert.assertEquals(returnedBeer.getId(), 1);
    }

//    @Test
//    public void getByIdShould_ReturnBeer_WhenBeerExists() {
//        //Arrange
//
//        //Act
//
//        //Assert
//    }
}
