package com.techelevator.controller;

import com.techelevator.Exceptions.EventNotFoundException;
import com.techelevator.dao.EventSqlDAO;
import com.techelevator.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EventController {

    @Autowired
    EventSqlDAO eventSqlDAO;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/events", method = RequestMethod.POST)
    public void create(@RequestBody Event event) {
        eventSqlDAO.create(event);
    }

    @RequestMapping(path = "/events", method = RequestMethod.GET)
    public List<Event> listUpcoming() {
        return eventSqlDAO.listUpcoming();
    }

    @RequestMapping(path = "/breweries/{id}/events", method = RequestMethod.GET)
    public List<Event> listByBreweryId(@PathVariable Long id) {
        return eventSqlDAO.listByBreweryId(id);
    }

    @RequestMapping(path = "/events/{id}", method = RequestMethod.GET)
    public Event findById(@PathVariable Long id) throws EventNotFoundException {
        return eventSqlDAO.findById(id);
    }

    @RequestMapping(path = "/events/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Event event, @PathVariable Long id) throws EventNotFoundException {
        eventSqlDAO.update(event, id);
    }

    @RequestMapping(path = "/events/{id}", method = RequestMethod.DELETE)
    public void deactivate(@PathVariable Long id) throws EventNotFoundException {
        try {
            eventSqlDAO.deactivate(id);
        } catch (EventNotFoundException e) {
            throw new EventNotFoundException();
        }
    }
}
