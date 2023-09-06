package com.chukhnov.example.kafka.http.request.order;

public record CreateRequest(String id,
                     String name,
                     String userId) {
}
