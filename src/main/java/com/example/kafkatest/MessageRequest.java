package com.example.kafkatest;

public class MessageRequest {
    private String message;

    public MessageRequest() {
    }

    public MessageRequest(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public MessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
}
