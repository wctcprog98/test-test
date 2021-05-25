package com.techelevator.dao;

import com.techelevator.model.Brewery;
import com.techelevator.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class BrewerySqlDAO implements BreweryDAO{

    private JdbcTemplate jdbcTemplate;

    public BrewerySqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Brewery> findAll() {
        List<Brewery> breweries = new ArrayList<>();
        String sql = "select * from breweries";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            Brewery brewery = mapRowToBrewery(results);
            breweries.add(brewery);
        }

        return breweries;
    }

    private Brewery mapRowToBrewery(SqlRowSet results){
        Brewery brewery = new Brewery();
        brewery.setId(results.getLong("brewery_id"));
        brewery.setBreweryName(results.getString("brewery_name"));
        brewery.setBrewerId(results.getInt("brewer_id"));
        brewery.setBreweryStreetAddress(results.getString("brewery_street_address"));
        brewery.setBreweryCity(results.getString("brewery_city"));
        brewery.setBreweryState(results.getString("brewery_state"));
        brewery.setBreweryZipCode(results.getInt("brewery_zip"));
        return brewery;


    }

}
