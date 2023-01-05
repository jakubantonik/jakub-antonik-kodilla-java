package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private Customer customer;
    private Product product;
    private int orderNumber;

    public Order(Customer customer, Product product, int orderNumber) {
        this.customer = customer;
        this.product = product;
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
