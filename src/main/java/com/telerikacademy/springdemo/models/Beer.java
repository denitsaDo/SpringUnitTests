package com.telerikacademy.springdemo.models;

import javax.validation.constraints.*;

public class Beer {

    @PositiveOrZero(message = "Id should be positive or zero")
    private int id;

    @NotBlank
    @NotNull
    @Size(min = 2, max = 25, message = "Name size should be between 2 and 25 symbols")
    private String name;

    @Positive
    private double abv;

    public Beer() {

    }

    public Beer(int id, String name, double abv) {
        this.id = id;
        this.name = name;
        this.abv = abv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }
}
