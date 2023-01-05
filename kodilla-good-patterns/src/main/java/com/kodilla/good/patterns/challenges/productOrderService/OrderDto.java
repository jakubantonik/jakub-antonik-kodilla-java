package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderDto {
    private User user;
    private boolean isOrdered;

    public OrderDto(final User user, final boolean isRented) {
        this.user = user;
        this.isOrdered = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isOrdered;
    }

}
