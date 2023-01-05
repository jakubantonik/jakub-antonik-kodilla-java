package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements RealizeOrder{
    public List<Order> retrieve(){
        List<Order> orderGlutenFreeShopList = new ArrayList<>();

        Customer customer1 = new Customer("Ania", "Lubaczów");
        Product product1 = new Product("apple", 20);
        int numberOrder1 = 22;
        orderGlutenFreeShopList.add(new Order(customer1, product1, numberOrder1));

        Customer customer2 = new Customer("Renata", "Tarnów");
        Product product2 = new Product("banana", 15);
        int numberOrder2 = 23;
        orderGlutenFreeShopList.add(new Order(customer2, product2, numberOrder2));

        return orderGlutenFreeShopList;
    }


    @Override
    public boolean process(Order order) {
        System.out.println("Order to:" + order.getCustomer() + " number: " + order.getOrderNumber()
                + " : " + order.getProduct() + " is sending.");
        return true;
    }
}
