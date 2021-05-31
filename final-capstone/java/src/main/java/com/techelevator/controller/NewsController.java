package com.techelevator.controller;

import com.techelevator.Exceptions.NewsNotFoundException;
import com.techelevator.dao.NewsSqlDAO;
import com.techelevator.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class NewsController {

    @Autowired
    NewsSqlDAO newsSqlDAO;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/news", method = RequestMethod.POST)
    public void create(@RequestBody News news) {
        newsSqlDAO.create(news);
    }

    @RequestMapping(path = "/breweries/{id}/news", method = RequestMethod.GET)
    public List<News> listByBreweryId(@PathVariable Long id) {
        return newsSqlDAO.listByBreweryId(id);
    }

    @RequestMapping(path = "/news/{id}", method = RequestMethod.GET)
    public News findById(@PathVariable Long id) throws NewsNotFoundException {
        return newsSqlDAO.findById(id);
    }

    @RequestMapping(path = "/news/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody News news, @PathVariable Long id) throws NewsNotFoundException {
        newsSqlDAO.update(news, id);
    }

    @RequestMapping(path = "/news/{id}", method = RequestMethod.DELETE)
    public void deactivate(@PathVariable Long id) throws NewsNotFoundException {
        newsSqlDAO.deactivate(id);
    }
}
