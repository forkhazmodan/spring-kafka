package com.chukhnov.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic getTopic(@Value("${topic.name.order.input}") String topic) {
        return TopicBuilder.name(topic)
            .build();
    }

//    @Bean
//    public NewTopic getTopic2(@Value("${avro.topic.matryoshka.input}") String topic) {
//        return TopicBuilder.name(topic)
//            .build();
//    }
}
