package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor implements RealizeOrder{

    @Override
    public void process(Order order) {
        System.out.println("Order to:" + order.getCustomer() + " number of order : " + order.getOrderNumber()
                + "\n" + order.getProduct() + "\n" + "Order is sending." + "\n");
    }


}
