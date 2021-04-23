package com.example.demo.kafka;

import com.example.demo.model.dto.DealInputDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaProducerDemo {

    private static final Logger log = LoggerFactory.getLogger(KafkaProducerDemo.class);
    public final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(DealInputDTO dealInputDTO) {
        log.info(String.format("Message sent -> %s", dealInputDTO));
        this.kafkaTemplate.send("test", dealInputDTO);
    }

}
