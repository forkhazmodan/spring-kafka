package com.chukhnov.example.kafka.service;

import com.chukhnov.example.kafka.Order;

public interface IOrderPublisherService {
    void publish(Order order);
}
