package com.kodilla.good.patterns.challenges.flight;

import java.util.*;

public class FlightService {

    List<SearchingFlights> flightList = new ArrayList<>();

    public List<SearchingFlights> flightList(){
        flightList.add(new SearchingFlights("Kraków", "Warszawa"));
        flightList.add(new SearchingFlights("Rzeszów", "Gdańsk"));
        flightList.add(new SearchingFlights("Warszawa", "Łódź"));
        flightList.add(new SearchingFlights("Katowice", "Kraków"));
        flightList.add(new SearchingFlights("Łódź", "Katowice"));
        flightList.add(new SearchingFlights("Gdańsk", "Kraków"));
        flightList.add(new SearchingFlights("Łódź", "Rzeszów"));
        flightList.add(new SearchingFlights("Kraków", "Gdańsk"));
        flightList.add(new SearchingFlights("Gdańsk", "Warszwa"));

        return flightList;
    }

    public Optional<SearchingFlights> availableFlightsFrom (String fromCity){
        return flightList().stream()
                .filter(flight -> flight.getFlightFrom().equals(fromCity))
                .findFirst();
    }

    public Optional<SearchingFlights> availableFlightsTo(String toCity){
        return flightList().stream()
                .filter(flights -> flights.getFlightTo().equals(toCity))
                .findFirst();
    }

    public Optional<SearchingFlights> availableFlightsBetweenCities(String fromCity, String byCity, String toCity){
        return flightList().stream()
                .filter(f -> f.getFlightFrom().equals(fromCity))
                .filter(f -> f.getFlightTo().equals(byCity))
                .filter(f -> f.getFlightFrom().equals(byCity))
                .filter(f -> f.getFlightTo().equals(toCity))
                .findFirst();
    }

}
