package com.chukhnov.example.kafka.streams;

import com.chukhnov.example.kafka.Order;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "${topic.name.order.input}", groupId = "groupId")
    public void consumerInput(
        @Payload final Order order,
        @Header(value = KafkaHeaders.RECEIVED_KEY, required = false) final String id,
        @Header(KafkaHeaders.RECEIVED_PARTITION) final int partition,
        @Header(KafkaHeaders.OFFSET) final int offset,
        @Header(value = "my-header", required = false) final Integer myHeader) {

        System.out.printf("[2] Received in {}-{} {}={}%n", partition, offset, id, order);
        System.out.println(myHeader);
    }
}
