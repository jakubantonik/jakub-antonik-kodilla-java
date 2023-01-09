package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        Shops shops = new Shops( new ExtraFoodShop(), new GlutenFreeShop(), new HealthyShop());
        OrderProcessor orderProcessor = new OrderProcessor();

        shops.extraFoodShop.retrieve().stream()
                .forEach(orderProcessor::process);
        shops.healthyShop.retrieve().stream()
                .forEach(orderProcessor::process);
        shops.glutenFreeShop.retrieve().stream()
                .forEach(orderProcessor::process);



    }
}
