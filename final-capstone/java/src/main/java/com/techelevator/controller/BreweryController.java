package com.techelevator.controller;

import com.techelevator.dao.BrewerySqlDAO;
import com.techelevator.model.Brewery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

   //todo find by name
}
