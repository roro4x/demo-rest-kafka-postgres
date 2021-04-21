package com.example.demo.controller;

import com.example.demo.kafka.KafkaProducerDemo;
import com.example.demo.model.DealInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/kafka")
public final class ControllerDemo {
    private final KafkaProducerDemo producerDemo;

    @Autowired
    public ControllerDemo(KafkaProducerDemo producerDemo) {
        this.producerDemo = producerDemo;
    }

    @PostMapping(value = "/send")
    public void sendMessageToKafkaTopic(@RequestBody String message) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        DealInput value = mapper.readValue(message, DealInput.class);
        this.producerDemo.sendMessage(value);
    }

}
