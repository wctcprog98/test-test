package com.techelevator.model;

public class Review {

    private Long id;
    private Long beerId;
    private Long reviewerId;
    private String reviewText;
    private int starRating;
    private boolean active;


    public Review() {
    }

    public Review(Long id, Long beerId, Long reviewerId, String reviewText, int starRating) {
        this.id = id;
        this.beerId = beerId;
        this.reviewerId = reviewerId;
        this.reviewText = reviewText;
        this.starRating = starRating;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBeerId() {
        return beerId;
    }

    public void setBeerId(Long beerId) {
        this.beerId = beerId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", beerId=" + beerId +
                ", reviewerId=" + reviewerId +
                ", reviewText='" + reviewText + '\'' +
                ", starRating=" + starRating +
                ", active=" + active +
                '}';
    }
}
