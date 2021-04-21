package com.example.demo.kafka;

import com.example.demo.model.DealInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerDemo {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerDemo.class);

    @Autowired
    public KafkaTemplate<String, Object> kafkaTemplate;


    public void sendMessage(DealInput dealInput) {
        logger.info(String.format("Message sent -> %s", dealInput));
        this.kafkaTemplate.send("test", dealInput);
    }

}
