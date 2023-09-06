package com.chukhnov.example.kafka.service;


import com.chukhnov.example.kafka.Order;

public class OrderService implements IOrderService {

    @Override
    public void createOrder(Order order) {
        System.out.println(order);
    }
}
