package com.kodilla.good.patterns.challenges.flight;

import java.util.List;

public class FlightProcessor {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        List<SearchingFlights> travelFromKrk = flightService.availableFlightsFrom("Kraków");
        System.out.println("Available travel: " + travelFromKrk);

        List<SearchingFlights> travelToLodz = flightService.availableFlightsTo("Łódź");
        System.out.println("Available travel: " + travelToLodz);

        List<SearchingFlights> travelFromGdanskToWwa = flightService.availableFlightsBetweenCities("Gdańsk", "Kraków", "Warszawa");
        System.out.println("Available travel: " + travelFromGdanskToWwa);
    }
}
