package com.example.demo.kafka;

import com.example.demo.model.dto.DealInputDTO;
import com.example.demo.service.DealService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumerDemo {

    private final DealService dealService;

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerDemo.class);

    @KafkaListener(topics = "test")
    public void consume(DealInputDTO message) {
        logger.info(String.format("Message recieved -> %s", message));
        dealService.saveData(message);
    }
}