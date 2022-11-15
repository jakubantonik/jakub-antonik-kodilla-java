package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();
    private final String nameOfContinent;

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public List<Country> getCountriesNames(){
        return countries;
    }

    public void addCountry (Country country){
        countries.add(country);
    }
}
