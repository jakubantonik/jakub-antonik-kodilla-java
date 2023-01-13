package com.kodilla.good.patterns.challenges.flight;

import java.util.Objects;

public class SearchingFlights {
    private final String flightFrom;
    private final String flightTo;

    public SearchingFlights(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }


    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "Flight from: " + flightFrom + " Flight to: " + flightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchingFlights that = (SearchingFlights) o;
        return flightFrom.equals(that.flightFrom) && flightTo.equals(that.flightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo);
    }
}
