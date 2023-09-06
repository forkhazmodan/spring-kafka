package com.chukhnov.example.kafka.service;


import com.chukhnov.example.kafka.Order;

public interface IOrderService {
    void createOrder(Order order);
}
