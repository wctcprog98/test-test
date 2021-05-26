package com.techelevator.dao;

import com.techelevator.Exceptions.BreweryNotFoundException;
import com.techelevator.model.Brewery;
import com.techelevator.model.User;

import java.util.List;

public interface BreweryDAO  {


    List<Brewery> findAll();
    Brewery create(Brewery brewery);
    Brewery findById(Long id) throws BreweryNotFoundException;

}
