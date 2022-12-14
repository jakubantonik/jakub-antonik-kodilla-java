package com.kodilla.good.patterns.challenges.food2door;

public class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String toString(){
        return " " + getName() + ", adress: " + getAddress() + "\n";
    }
}
