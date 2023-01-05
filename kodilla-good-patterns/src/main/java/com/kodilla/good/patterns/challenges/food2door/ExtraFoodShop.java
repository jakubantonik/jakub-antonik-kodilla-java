package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements RealizeOrder{

    public List<Order> retrieve(){
        List<Order> orderExtraFoodShopList = new ArrayList<>();

        Customer customer1 = new Customer("Paweł", "Kraków");
        Product product1 = new Product("pork", 2);
        int orderNumber1 = 20;
        orderExtraFoodShopList.add(new Order(customer1, product1, orderNumber1));

        Customer customer2 = new Customer ("Franek", "Rzeszów");
        Product product2 = new Product("cavior", 5);
        int orderNumber2 = 21;
        orderExtraFoodShopList.add(new Order(customer2, product2, orderNumber2));


        return orderExtraFoodShopList;
    }


    @Override
    public boolean process(Order order) {
        System.out.println("Order to:" + order.getCustomer() + " number: " + order.getOrderNumber()
                + " : " + order.getProduct() + " is sending.");
        return true;
    }
}
