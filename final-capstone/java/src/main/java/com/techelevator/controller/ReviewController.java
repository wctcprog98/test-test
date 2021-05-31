package com.techelevator.controller;

import com.techelevator.Exceptions.ReviewNotFountException;
import com.techelevator.dao.ReviewSqlDAO;
import com.techelevator.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReviewController {

    @Autowired
    ReviewSqlDAO reviewSqlDAO;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public void create(@RequestBody Review review) {
        reviewSqlDAO.create(review);
    }

    @RequestMapping(path = "reviews/{id}", method = RequestMethod.GET)
    public Review findById(@PathVariable Long id) throws ReviewNotFountException {
        return reviewSqlDAO.findById(id);
    }

    @RequestMapping(path = "/breweries/{id}/reviews", method = RequestMethod.GET)
    public List<Review> listByBreweryId(@PathVariable Long id) {
        return reviewSqlDAO.listByBreweryId(id);
    }

    @RequestMapping(path = "beer/{id}/reviews", method = RequestMethod.GET)
    public List<Review> listByBeerId(@PathVariable Long id) {
        return reviewSqlDAO.listByBeerId(id);
    }

    @RequestMapping(path = "reviews/{id}", method = RequestMethod.PUT)
    public void updateReview(@RequestBody Review review, @PathVariable Long id) throws ReviewNotFountException {
        reviewSqlDAO.update(review, id);
    }

    @RequestMapping(path = "reviews/{id}", method = RequestMethod.DELETE)
    public void deactivateReview(@PathVariable Long id) throws ReviewNotFountException {
        reviewSqlDAO.deactivate(id);
    }

}
