package com.techelevator.Exceptions;

public class BreweryNotFoundException extends Exception
{
    public BreweryNotFoundException() {
        super("brewery not found");
    }
}
