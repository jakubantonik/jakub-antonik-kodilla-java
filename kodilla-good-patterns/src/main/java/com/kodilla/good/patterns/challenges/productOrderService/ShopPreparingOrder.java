package com.kodilla.good.patterns.challenges.productOrderService;

public class ShopPreparingOrder implements OrderService {
    @Override
    public boolean order(User user, Product product) {
        System.out.println("Preparing order " + product.getName() + " for " + user.getFirstName() + user.getLastName() + " ID: " + user.getIDOfClient());
        return true;
    }
}
