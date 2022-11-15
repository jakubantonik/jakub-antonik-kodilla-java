package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent (Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = (BigDecimal) continents.stream()
                .flatMap(continent -> continent.getCountriesNames().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum = sum.add(country));


        return peopleQuantity;
    }
}
