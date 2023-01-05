package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        Shops shops = new Shops( new ExtraFoodShop(), new GlutenFreeShop(), new HealthyShop());



    }
}
