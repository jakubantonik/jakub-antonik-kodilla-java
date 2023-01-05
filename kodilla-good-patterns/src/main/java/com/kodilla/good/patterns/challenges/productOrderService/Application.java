package com.kodilla.good.patterns.challenges.productOrderService;

public class Application {
    public static void main(String[] args) {
        OrderProductsRetriever orderProductsRetriever = new OrderProductsRetriever();
        OrderProcessor orderProcessor = new OrderProcessor(new ClientInfoService(), new ShopPreparingOrder(), new ShopOrderingRepository());

        orderProductsRetriever.retrieve().stream()
                .forEach(orderProcessor::process);

    }
}
