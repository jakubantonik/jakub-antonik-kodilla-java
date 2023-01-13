package com.kodilla.good.patterns.challenges.flight;

import java.util.Optional;

public class FlightProcessor {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        Optional<SearchingFlights> travelFrom = flightService.availableFlightsFrom("Kraków");
        System.out.println("Available travel to: " + travelFrom);

        Optional<SearchingFlights> travelTo = flightService.availableFlightsTo("Łódź");
        System.out.println("Available travel to: " + travelTo);

        Optional<SearchingFlights> travelFromCityToCity = flightService.availableFlightsBetweenCities("Kraków", "Rzeszów",  "Łódź");
        System.out.println("Available travel to: " + travelFromCityToCity);
    }
}
