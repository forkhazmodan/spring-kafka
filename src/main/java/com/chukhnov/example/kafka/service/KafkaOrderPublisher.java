package com.chukhnov.example.kafka.service;

import com.chukhnov.example.kafka.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaOrderPublisher implements IOrderPublisherService {

    private final String topic;

    private final KafkaTemplate<String, Order> template;

    public KafkaOrderPublisher(@Value("${topic.name.order.input}") String topic,
                               KafkaTemplate<String, Order> template) {
        this.topic = topic;
        this.template = template;
    }

    @Override
    public void publish(Order order) {
        template.send(topic, order.getId(), order);
    }
}
