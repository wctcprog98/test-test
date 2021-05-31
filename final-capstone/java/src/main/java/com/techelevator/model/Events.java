package com.techelevator.model;

import java.sql.Time;
import java.util.Date;

public class Events {
    private Long eventId;
    private String eventName;
    private Date eventDate;
    private Time eventTime;
    private String description;
    private Long breweryId;
    private boolean active;

    public Events(Long eventId, String eventName, Date eventDate, Time eventTime, String description, Long breweryId, boolean active) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.description = description;
        this.breweryId = breweryId;
        this.active = active;
    }

    public Events() {

    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Time getEventTime() {
        return eventTime;
    }

    public void setEventTime(Time eventTime) {
        this.eventTime = eventTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(Long breweryId) {
        this.breweryId = breweryId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventTime=" + eventTime +
                ", description='" + description + '\'' +
                ", breweryId=" + breweryId +
                ", active=" + active +
                '}';
    }
}
