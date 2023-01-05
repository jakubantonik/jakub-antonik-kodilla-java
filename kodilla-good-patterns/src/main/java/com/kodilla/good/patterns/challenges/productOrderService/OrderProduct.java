package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public class OrderProduct {
    private User user;
    private Product product;
    private LocalDate dateOfOrder;

    public OrderProduct(User user, Product product, LocalDate dateOfOrder){
        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
