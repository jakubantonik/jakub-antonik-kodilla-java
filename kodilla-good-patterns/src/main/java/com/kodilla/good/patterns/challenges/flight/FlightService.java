package com.kodilla.good.patterns.challenges.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        flightList.add(new SearchingFlights("Warszawa", "Rzeszów"));

        return flightList;

    }

    public List<SearchingFlights> availableFlightsFrom(String flightFrom){
        return flightList.stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .collect(Collectors.toList());
    }

    public List<SearchingFlights> availableFlightsTo(String flightTo){
        return flightList.stream()
                .filter(flights -> flights.getFlightTo().equals(flightTo))
                .collect(Collectors.toList());
    }

    public List<SearchingFlights> availableFlightsBetweenCities(String flightFrom, String flightBy, String flightTo){
        SearchingFlights flightFromCity = flightList.stream()
                .filter(flight -> flight.getFlightFrom().equals(flightFrom))
                .filter(flight -> flight.getFlightTo().equals(flightBy))
                .findAny().get();

        SearchingFlights flightToCity = flightList.stream()
                .filter(flight -> flight.getFlightFrom().equals(flightBy))
                .filter(flight -> flight.getFlightTo().equals(flightTo))
                .findAny().get();

        List<SearchingFlights> searchingFlights = new ArrayList<>();
        searchingFlights.add(flightFromCity);
        searchingFlights.add(flightToCity);

        return searchingFlights;
    }

}
