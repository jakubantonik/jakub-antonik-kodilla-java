package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculateCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, cheese", description);
    }

    @Test
    public void testPizzaWithMushroomsGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculateCost);
    }

    @Test
    public void testPizzaWithMushroomsGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, cheese + mushrooms", description);
    }

    @Test
    public void testPizzaWithMushroomsAndSalamiGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        theOrder = new PizzaWithSalamiDecorator(theOrder);
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), calculateCost);
    }

    @Test
    public void testPizzaWithMushroomsAndSalamiGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        theOrder = new PizzaWithSalamiDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, cheese + mushrooms + salami", description);
    }
    @Test
    public void testPizzaWithMushroomsPineappleAragulaProvidedByBoltGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        theOrder = new PizzaWithPineappleDecorator(theOrder);
        theOrder = new PizzaWithAragulaDecorator(theOrder);
        theOrder = new BoltOrderDecorator(theOrder);
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), calculateCost);
    }
    @Test
    public void testPizzaWithMushroomsPineappleAragulaProvidedByBoltGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        theOrder = new PizzaWithPineappleDecorator(theOrder);
        theOrder = new PizzaWithAragulaDecorator(theOrder);
        theOrder = new BoltOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, cheese + mushrooms + pineapple + aragula provided by Bolt", description);
    }
    @Test
    public void testPizzaWithMushroomsSalamiAragulaGarlicSauceProvidedByUberGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        theOrder = new PizzaWithSalamiDecorator(theOrder);
        theOrder = new PizzaWithAragulaDecorator(theOrder);
        theOrder = new PizzaWithGarlicSauceDecorator(theOrder);
        theOrder = new UberOrderDecorator(theOrder);
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(41), calculateCost);
    }
    @Test
    public void testPizzaWithMushroomsSalamiAragulaGarlicSauceProvidedByUberGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithMushroomsDecorator(theOrder);
        theOrder = new PizzaWithSalamiDecorator(theOrder);
        theOrder = new PizzaWithAragulaDecorator(theOrder);
        theOrder = new PizzaWithGarlicSauceDecorator(theOrder);
        theOrder = new UberOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with sauce, cheese + mushrooms + salami + aragula + garlic sauce provided by Uber", description);
    }
}
