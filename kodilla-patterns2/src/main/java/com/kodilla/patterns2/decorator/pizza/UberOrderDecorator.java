package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class UberOrderDecorator extends AbstractPizzaOrderDecorator{
    UberOrderDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(10));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " provided by Uber";
    }
}
