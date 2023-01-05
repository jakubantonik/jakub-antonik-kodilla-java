package com.kodilla.good.patterns.challenges.productOrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderProduct orderProduct) {
        boolean isOrdered = orderService.order(orderProduct.getUser(), orderProduct.getProduct());

        if (isOrdered) {
            informationService.inform(orderProduct.getUser());
            orderRepository.createOrder(orderProduct.getUser(), orderProduct.getProduct(), orderProduct.getDateOfOrder());
            return new OrderDto(orderProduct.getUser(), true);
        } else {
            return new OrderDto(orderProduct.getUser(), false);
        }
    }

}
