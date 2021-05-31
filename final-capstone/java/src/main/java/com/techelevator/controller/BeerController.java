package com.techelevator.controller;


import com.techelevator.Exceptions.BeerNotFoundException;
import com.techelevator.dao.BeerSqlDAO;
import com.techelevator.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BeerController {

    @Autowired
    BeerSqlDAO beerSqlDAO;

    @RequestMapping(path = "/breweries/{id}/beer", method = RequestMethod.GET)
    public List<Beer> getAllBeers(@PathVariable Long id) {
        return beerSqlDAO.findAll(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/breweries/{id}", method = RequestMethod.POST)
    public void create(@RequestBody Beer formBeer) {
        beerSqlDAO.create(formBeer);

    }

    @RequestMapping(path = "/breweries/{id}/beer/{id}", method = RequestMethod.PUT)
    public void updateBeer(@RequestBody Beer beer, @PathVariable long id) throws BeerNotFoundException {
        beerSqlDAO.updateBeer(beer, id);
    }

    @RequestMapping(path = "/breweries/{id}/beer/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) throws BeerNotFoundException {
        beerSqlDAO.delete(id);
    }

    @RequestMapping(path = "/breweries/{id}/beer/{id}", method = RequestMethod.GET)
    public Beer findById(@PathVariable Long id) throws BeerNotFoundException {
        return beerSqlDAO.findById(id);
    }
}


