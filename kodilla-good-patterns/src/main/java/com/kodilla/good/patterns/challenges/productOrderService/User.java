package com.kodilla.good.patterns.challenges.productOrderService;

public class User {
    private String firstName;
    private String lastName;
    private int IDOfClient;

    public User(String firstName, String lastName, int IDOfClient){
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDOfClient = IDOfClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIDOfClient() {
        return IDOfClient;
    }
}
