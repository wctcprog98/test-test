package com.techelevator.model;

public class Brewery {

    private Long id;
    private String breweryName;
    private int brewerId; // grab info from object when needed
    private String breweryStreetAddress;
    private String breweryCity;
    private String breweryState;
    private int breweryZipCode;

    private String breweryWebsite;

    public Brewery(Long id, String breweryName, int brewerId, String breweryStreetAddress, String breweryCity, String breweryState, int breweryZipCode, String breweryWebsite) {
        this.id = id;
        this.breweryName = breweryName;
        this.brewerId = brewerId;
        this.breweryStreetAddress = breweryStreetAddress;
        this.breweryCity = breweryCity;
        this.breweryState = breweryState;
        this.breweryZipCode = breweryZipCode;
        this.breweryWebsite = breweryWebsite;

    }

    public Brewery(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public int getBrewerId() {
        return brewerId;
    }

    public void setBrewerId(int brewerId) {
        this.brewerId = brewerId;
    }

    public String getBreweryStreetAddress() {
        return breweryStreetAddress;
    }

    public void setBreweryStreetAddress(String breweryStreetAddress) {
        this.breweryStreetAddress = breweryStreetAddress;
    }

    public String getBreweryCity() {
        return breweryCity;
    }

    public void setBreweryCity(String breweryCity) {
        this.breweryCity = breweryCity;
    }

    public String getBreweryState() {
        return breweryState;
    }

    public void setBreweryState(String breweryState) {
        this.breweryState = breweryState;
    }

    public int getBreweryZipCode() {
        return breweryZipCode;
    }

    public void setBreweryZipCode(int breweryZipCode) {
        this.breweryZipCode = breweryZipCode;
    }

    public String getBreweryWebsite() {
        return breweryWebsite;
    }

    public void setBreweryWebsite(String breweryWebsite) {
        this.breweryWebsite = breweryWebsite;
    }
}

