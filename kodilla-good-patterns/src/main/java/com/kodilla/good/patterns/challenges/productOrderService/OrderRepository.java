package com.kodilla.good.patterns.challenges.productOrderService;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrder(User user, Product product, LocalDate dateOfOrder);

}
