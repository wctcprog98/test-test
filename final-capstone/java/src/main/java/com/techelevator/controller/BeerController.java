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

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/beer", method = RequestMethod.POST)
    public void create(@RequestBody Beer beer) {
        beerSqlDAO.create(beer);
    }

    @RequestMapping(path = "/breweries/{id}/beer", method = RequestMethod.GET)
    public List<Beer> listByBreweryId(@PathVariable Long id) {
        return beerSqlDAO.listByBreweryId(id);
    }

    @RequestMapping(path = "/beer/{id}", method = RequestMethod.GET)
    public Beer findById(@PathVariable Long id) throws BeerNotFoundException {
        return beerSqlDAO.findById(id);
    }

    @RequestMapping(path = "/beer/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Beer beer, @PathVariable long id) throws BeerNotFoundException {
        beerSqlDAO.update(beer, id);
    }

    @RequestMapping(path = "/beer/{id}",method = RequestMethod.DELETE)
    public void deactivate(@PathVariable Long id) throws BeerNotFoundException {
        beerSqlDAO.deactivate(id);
    }
}


