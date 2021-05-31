package com.techelevator.dao;

import com.techelevator.model.Beer;
import com.techelevator.model.Events;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class EventsSqlDAO implements EventsDAO{

    private JdbcTemplate jdbcTemplate;

    public EventsSqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Events event) {
        String sql = "INSERT INTO events (event_name, event_date, event_time, event_description, brewery_id) " +
                " VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, event.getEventName(), event.getEventDate(), event.getEventTime(), event.getDescription(), event.getBreweryId());
    }

    @Override
    public List<Events> findAll(long id) {
        List <Events> event = new ArrayList<>();
        String sql ="SELECT * FROM events";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        while(results.next()) {

        }
        return null;
    }

    @Override
    public Events findById(Long id) {
        return null;
    }

    @Override
    public void updateBeer(Beer beer, Long id) {

    }

    @Override
    public void delete(Long id) {

    }

    private Events mapRowToEvent(SqlRowSet rs) {
        Events event = new Events();
        event.setEventName(rs.getString("event_name"));
        event.setEventDate(rs.getDate("event_date"));
        event.setEventTime(rs.getTime("event_time"));
        event.setDescription(rs.getString("event_description"));
        return event;
    }
}
