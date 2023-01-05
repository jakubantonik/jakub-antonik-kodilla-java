package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderProductsRetriever {
    public List<OrderProduct> retrieve(){
        List<OrderProduct> orderProducts = new ArrayList<>();

        User user1 = new User("Kamil", "Nowak", 001);
        Product product1 = new Product("God Of War Ragnarok", 299.99);
        LocalDate dateOfOrder1 = LocalDate.of(2022,12,20);
        orderProducts.add(new OrderProduct(user1,product1,dateOfOrder1));

        User user2 = new User("Maja", "Kowalska", 002);
        Product product2 = new Product("Rower górski", 1999.95);
        LocalDate dateOfOrder2 = LocalDate.of(2022,12,22);
        orderProducts.add(new OrderProduct(user2,product2,dateOfOrder2));

        User user3 = new User("Damian", "Kwiatek", 003);
        Product product3 = new Product("IPhone14", 5999);
        LocalDate dateOfOrder3 = LocalDate.of(2022,12,18);
        orderProducts.add(new OrderProduct(user3, product3, dateOfOrder3));

        User user4 = new User("Natalia", "Twardowska", 004);
        Product product4 = new Product("Puzzle", 59.9);
        LocalDate dateOfOrder4 = LocalDate.of(2022,12,21);
        orderProducts.add(new OrderProduct(user4, product4, dateOfOrder4));

        User user5 = new User("Maria", "Nowak", 005);
        Product product5 = new Product("Kwiat", 95.9);
        LocalDate dateOfOrder5 = LocalDate.of(2022,12,15);
        orderProducts.add(new OrderProduct(user5, product5, dateOfOrder5));

        return orderProducts;
    }
}
