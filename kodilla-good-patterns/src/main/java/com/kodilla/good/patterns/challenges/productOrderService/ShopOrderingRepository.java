package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShopOrderingRepository implements OrderRepository{
    private List<String>orders = new ArrayList<>();

    @Override
    public boolean createOrder(User user, Product product, LocalDate dateOfOrder) {
        orders.add("Order created: " + dateOfOrder + " User: " + user.getFirstName() +
                user.getLastName() + " ID: " + user.getIDOfClient() + " ordered: " + product.getName());

        return true;

    }

    public void showOrders(){
        orders.stream()
                .forEach(System.out::println);
    }
}
