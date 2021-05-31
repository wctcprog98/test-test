package com.techelevator.Exceptions;

public class ReviewNotFountException extends Exception {
    public ReviewNotFountException() {
        super("Review was not found!");
    }
}
