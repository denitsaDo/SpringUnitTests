package com.telerikacademy.springdemo.exceptions;

public class DuplicateEntityException extends RuntimeException {
    public DuplicateEntityException(String message) {
        super((message));
    }
}
