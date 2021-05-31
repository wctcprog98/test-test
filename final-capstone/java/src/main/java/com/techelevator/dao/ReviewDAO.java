package com.techelevator.dao;

import com.techelevator.Exceptions.ReviewNotFountException;
import com.techelevator.model.Review;

import java.util.List;

public interface ReviewDAO {

    public void create(Review review);
    public List<Review> listByBreweryId(Long breweryId);
    public List<Review> listByBeerId(Long beerId);
    public Review findById(Long reviewId) throws ReviewNotFountException;
    public void update(Review review, Long reviewId) throws ReviewNotFountException;
    public void deactivate(Long reviewId) throws ReviewNotFountException;
}
