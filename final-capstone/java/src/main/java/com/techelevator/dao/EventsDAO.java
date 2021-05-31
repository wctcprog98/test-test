package com.techelevator.dao;

import com.techelevator.Exceptions.BeerNotFoundException;
import com.techelevator.model.Beer;
import com.techelevator.model.Events;

import java.util.List;
public interface EventsDAO {
    void create(Events event);
    List<Events> findAll(long id);
    Events findById(Long id);
    void updateBeer(Beer beer, Long id);
    void delete(Long id);
}
