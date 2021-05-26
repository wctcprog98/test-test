package com.techelevator.controller;

import com.techelevator.Exceptions.BreweryNotFoundException;
import com.techelevator.dao.BrewerySqlDAO;
import com.techelevator.model.Brewery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BreweryController {
    @Autowired
    BrewerySqlDAO brewerySqlDAO;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<Brewery> getAllBreweries() {
       return brewerySqlDAO.findAll();
    }

    @RequestMapping(path ="/breweries", method = RequestMethod.POST)
    public Brewery create(@RequestBody Brewery formBrewery) {
        return brewerySqlDAO.create(formBrewery);
    }

    @RequestMapping(path ="/breweries/{id}", method = RequestMethod.GET)
    public Brewery findById(@PathVariable Long breweryId) throws
            BreweryNotFoundException {
        return brewerySqlDAO.findById(breweryId);
    }



   //todo find by name
}
