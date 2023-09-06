package com.chukhnov.example.kafka.streams;

import com.chukhnov.example.kafka.Order;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "${topic.name.order.input}", groupId = "groupId")
    public void consumerInput(ConsumerRecord<String, Order> data) {
        System.out.println("consumerInput: " + data.value());
        System.out.println(data.value());
    }
}
