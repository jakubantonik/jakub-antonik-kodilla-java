package com.kodilla.good.patterns.challenges.flight;

import java.util.Optional;

public class FlightProcessor {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        Optional<SearchingFlights> travelFrom = flightService.availableFlightsFrom("Kraków");
        travelFrom.ifPresent(searchingFlights -> System.out.println("Available travel: " + searchingFlights));

        Optional<SearchingFlights> travelTo = flightService.availableFlightsTo("Łódź");
        travelTo.ifPresent(searchingFlights -> System.out.println("Available travel: " + searchingFlights));

        Optional<SearchingFlights> travelFromCityToCity = flightService.availableFlightsBetweenCities("Kraków", "Rzeszów");
        travelFromCityToCity.ifPresent(searchingFlights -> System.out.println("Available travel: " + searchingFlights));
    }
}
