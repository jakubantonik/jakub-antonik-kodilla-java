package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    public String toString(){
        return "Customer bought: " + getName() + " in quantity " + getQuantity();
    }
}
