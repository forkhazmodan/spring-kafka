package com.chukhnov.example.kafka.config;

import com.chukhnov.example.kafka.Order;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {

    @Bean
    public ProducerFactory<String, Order> producerFactory(KafkaProperties properties) {
        return new DefaultKafkaProducerFactory<>(properties.buildProducerProperties());
    }
//    @Bean
//    public ProducerFactory<String, Matryoshka> producerFactory2(KafkaProperties properties) {
//        return new DefaultKafkaProducerFactory<>(properties.buildProducerProperties());
//    }
    @Bean
    public KafkaTemplate<String, Order> kafkaTemplate(ProducerFactory<String, Order> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
//    @Bean
//    public KafkaTemplate<String, Matryoshka> kafkaTemplate2(ProducerFactory<String, Matryoshka> producerFactory) {
//        return new KafkaTemplate<>(producerFactory);
//    }
}
