package com.techelevator.controller;


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

//@RequestMapping(path = "/breweries/{id}", method = RequestMethod.GET)
//    public List<Beer> getAllBeers() {
//    return beerSqlDAO.findAll();
//}

@ResponseStatus(HttpStatus.CREATED)
@RequestMapping(path ="/breweries/{id", method = RequestMethod.POST)
public void create(@RequestBody Beer formBeer) {
    beerSqlDAO.create(formBeer);
}
}
