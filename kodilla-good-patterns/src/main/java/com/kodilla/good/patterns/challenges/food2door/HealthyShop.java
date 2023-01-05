package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements RealizeOrder {
    public List<Order> retrieve(){
        List<Order>orderHealthyShopList = new ArrayList<>();

        Customer customer1 = new Customer("Ania", "Warszawa");
        Product product1 = new Product("cucumber", 30);
        int numberOrder1 = 24;
        orderHealthyShopList.add(new Order(customer1, product1, numberOrder1));

        Customer customer2 = new Customer("Renata", "Zabierzów");
        Product product2 = new Product("tomato", 25);
        int numberOrder2 = 25;
        orderHealthyShopList.add(new Order(customer2, product2, numberOrder2));


        return orderHealthyShopList;
    }


    @Override
    public boolean process(Order order) {
        System.out.println("Order to:" + order.getCustomer() + " number: " + order.getOrderNumber()
                + " : " + order.getProduct() + " is sending.");
        return true;
    }

}
