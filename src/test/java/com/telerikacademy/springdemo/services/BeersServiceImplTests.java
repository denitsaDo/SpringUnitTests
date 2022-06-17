package com.telerikacademy.springdemo.services;

import com.telerikacademy.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.springdemo.models.Beer;
import com.telerikacademy.springdemo.repositories.BeersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static com.telerikacademy.springdemo.Factory.createBeer;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class BeersServiceImplTests {

    @Mock
    BeersRepository repository;

    @InjectMocks
    BeersServiceImpl mockService;

    @Test
    public void getByIdShould_ReturnBeer_WhenBeerExists() {
        //Arrange
        Beer expectedBeer = createBeer();

        Mockito.when(repository.getById(1))
                .thenReturn(expectedBeer);
        //Act
        Beer returnedBeer = mockService.getById(1);

        //Assert
        Assert.assertEquals(returnedBeer.getId(), expectedBeer.getId());
    }


    @Test
    public void getByIdShould_CallRepository() {
        //Arrange
        Beer expectedBeer = createBeer();

        Mockito.when(repository.getById(1))
                .thenReturn(expectedBeer);

        //Act
        mockService.getById(1);
//        mockService.getById(1);

        //Assert
        Mockito.verify(repository, Mockito.times(1)).getById(1);
    }

    @Test(expected = DuplicateEntityException.class)
    public void createShould_Throw_WhenBeerAlreadyExists() {
        //Arrange
        Mockito.when(repository.checkBeerExists(anyString())).thenReturn(true);
        //Act
        mockService.create(createBeer());
        //Assert
        Assertions.assertThrows(DuplicateEntityException.class,
                ()-> mockService.create(createBeer()));

    }

}
