package com.kodilla.exception.test;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlights {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("rzeszow", true);
        airports.put("krakow", true);
        airports.put("warszawa", false);
        airports.put("lodz", false);
        airports.put("gdansk", true);
        airports.put("szczecin",false);

        if(airports.containsKey(flight.getDepartureAirport())){
            System.out.println("available");
        } else {
            throw new RouteNotFoundException();
        }
    }
    public static void main(String [] args){
        SearchingFlights searchingFlights = new SearchingFlights();
        Flight flight = new Flight("berlin", "lodz");

        try {
            System.out.println("asd");
            searchingFlights.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Not available");
        }

    }
}
