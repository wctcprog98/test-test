package com.techelevator.controller;

import com.techelevator.Exceptions.BreweryNotFoundException;
import com.techelevator.dao.BrewerySqlDAO;
import com.techelevator.model.Brewery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BreweryController {

    @Autowired
    BrewerySqlDAO brewerySqlDAO;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path ="/breweries", method = RequestMethod.POST)
    public void create(@RequestBody Brewery formBrewery) {
        brewerySqlDAO.create(formBrewery);
    }

    @RequestMapping(path = "/breweries", method = RequestMethod.GET)
    public List<Brewery> listAll() {
       return brewerySqlDAO.listAll();
    }

    @RequestMapping(path ="/breweries/{id}", method = RequestMethod.GET)
    public Brewery findById(@PathVariable Long id) throws
            BreweryNotFoundException {
        return brewerySqlDAO.findById(id);
    }

    @RequestMapping(path = "/breweries/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Brewery brewery, @PathVariable Long id) throws BreweryNotFoundException {
        System.out.println(brewery);
        brewerySqlDAO.update(brewery, id);
    }

    @RequestMapping(path ="/breweries/{id}", method = RequestMethod.DELETE)
    public void deactivate(@PathVariable Long id) throws BreweryNotFoundException {
        brewerySqlDAO.deactivate(id);
    }
}
