package com.example.demo.controller;

import com.example.demo.kafka.KafkaProducerDemo;
import com.example.demo.model.dto.DealInputDTO;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void sendMessageToKafkaTopic(@RequestBody DealInputDTO message) {
        this.producerDemo.sendMessage(message);
    }

}
