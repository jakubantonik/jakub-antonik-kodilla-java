package com.kodilla.good.patterns.challenges.food2door;

public class Shops {
    ExtraFoodShop extraFoodShop;
    GlutenFreeShop glutenFreeShop;
    HealthyShop healthyShop;

    public Shops(ExtraFoodShop extraFoodShop, GlutenFreeShop glutenFreeShop, HealthyShop healthyShop) {
        this.extraFoodShop = extraFoodShop;
        this.glutenFreeShop = glutenFreeShop;
        this.healthyShop = healthyShop;
    }


}
