package com.chukhnov.example.kafka.http.controller;


import com.chukhnov.example.kafka.Order;
import com.chukhnov.example.kafka.http.request.order.CreateRequest;
import java.util.UUID;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
class OrderController {

    private KafkaTemplate<String, Order> template;

    public OrderController(KafkaTemplate<String, Order> template) {
        this.template = template;
    }

    @PostMapping
    public void create(@RequestBody CreateRequest request) {
        template.send("topic-1-order", new Order(
            UUID.randomUUID().toString(),
            request.name(),
            request.userId())
        );
    }
}
