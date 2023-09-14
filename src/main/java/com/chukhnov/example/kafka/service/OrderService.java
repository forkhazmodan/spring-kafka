package com.chukhnov.example.kafka.service;


import com.chukhnov.example.kafka.Order;

public class OrderService implements IOrderService {

    private final IOrderPublisherService publisher;

    public OrderService(IOrderPublisherService publisher) {
        this.publisher = publisher;
    }

    @Override
    public void createOrder(Order order) {
        //do stuff
        publisher.publish(order);
    }
}
