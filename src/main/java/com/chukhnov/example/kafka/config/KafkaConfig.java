package com.chukhnov.example.kafka.config;

import com.chukhnov.example.kafka.Order;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
public class KafkaConfig {
//
//    @Bean
//    public NewTopic getTopic(@Value("${topic.name.order}") String topic) {
//        return TopicBuilder.name(topic)
//            .build();
//    }
//
//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Order>> factory(ConsumerFactory<String, Order> consumerFactory) {
//        ConcurrentKafkaListenerContainerFactory<String, Order> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory);
//        return factory;
//    }
//
//    @Bean
//    public ConsumerFactory<String, Order> consumerFactory(KafkaProperties properties) {
//        return new DefaultKafkaConsumerFactory<>(properties.buildConsumerProperties());
//    }
//
//    @Bean
//    public ProducerFactory<String, Order> producerFactory(KafkaProperties properties) {
//        return new DefaultKafkaProducerFactory<>(properties.buildProducerProperties());
//    }
//
//    @Bean
//    public KafkaTemplate<String, Order> kafkaTemplate(ProducerFactory<String, Order> producerFactory) {
//        return new KafkaTemplate<>(producerFactory);
//    }
}
