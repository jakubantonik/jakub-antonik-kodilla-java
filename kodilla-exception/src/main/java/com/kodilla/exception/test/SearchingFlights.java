package com.kodilla.exception.test;

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

        if(airports.containsKey("rzeszow")){
            System.out.println("available");
        } else {
            throw new RouteNotFoundException();
        }
        if(airports.containsKey("lodz")){
            System.out.println("available");
        } else {
            throw new RouteNotFoundException();
        }



    }
    public static void main(String [] args){
        SearchingFlights searchingFlights = new SearchingFlights();

        try {
            Flight flight = new Flight("krakow", "warszawa");
            searchingFlights.findFlight(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Not available");
        }

    }
}
