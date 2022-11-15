package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Country poland = new Country ("Poland", new BigDecimal("2000000"));
        Country germany = new Country ("Germany", new BigDecimal("3000000"));
        Country france = new Country ("France", new BigDecimal("2500000"));
        Country china = new Country ("China", new BigDecimal("5000000"));
        Country russia = new Country ("Russia", new BigDecimal("4500000"));
        Country japan = new Country ("Japan", new BigDecimal("2000000"));

        world.addContinent(europe);
        world.addContinent(asia);
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        asia.addCountry(china);
        asia.addCountry(russia);
        asia.addCountry(japan);

        //When
        BigDecimal peopleQuantityInWorld = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("19000000");
        Assertions.assertEquals(expectedQuantity, peopleQuantityInWorld );
    }
}
