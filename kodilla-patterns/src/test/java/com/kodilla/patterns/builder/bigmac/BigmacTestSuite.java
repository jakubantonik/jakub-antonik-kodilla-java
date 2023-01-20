package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(3)
                .rollType(RollType.BUN_WITHOUT_SESAME)
                .sauce(SauceType.BARBECUE)
                .ingredient(IngredientsType.LETTUCE)
                .ingredient(IngredientsType.MUSHROOMS)
                .ingredient(IngredientsType.BACON)
                .ingredient(IngredientsType.CHEESE)
                .build();
        System.out.println(bigmac);

        //When
        int quantityOfBurgers = bigmac.getBurgers();
        int quantityOfIngredients = bigmac.getIngredients().size();


        //Then
        Assertions.assertEquals(3, quantityOfBurgers);
        Assertions.assertEquals(4, quantityOfIngredients);

    }
}
