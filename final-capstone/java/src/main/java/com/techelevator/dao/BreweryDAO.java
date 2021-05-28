package com.techelevator.dao;

import com.techelevator.Exceptions.BreweryNotFoundException;
import com.techelevator.model.Brewery;

import java.util.List;

public interface BreweryDAO  {

    void create(Brewery brewery);
    List<Brewery> findAll();
    Brewery findById(Long id) throws BreweryNotFoundException;
    void updateBrewery(Brewery brewery, Long id) throws BreweryNotFoundException;
    void deactivateBrewery(Long id) throws BreweryNotFoundException;

}
