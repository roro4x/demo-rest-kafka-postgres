package com.example.demo.kafka;

import com.example.demo.service.DealService;
import com.example.demo.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDemo {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerDemo.class);

    @KafkaListener(topics = "test")
    public void consume(DealInput message) {
        logger.info(String.format("Message recieved -> %s", message));
        DealService dealService = new DealService();
        Client client = new Client(message.getClient().getName(), message.getClient().getPhone(), message.getClient().getBirthDate());
        dealService.saveClient(client);
        Car car = new Car(message.getCar().getBrand(), message.getCar().getModel(), message.getCar().getVin());
        dealService.saveCar(car);
        Manager manager = new Manager(message.getManager().getName(), message.getManager().getPhone());
        dealService.saveManager(manager);
        Deal deal = new Deal(message.getDeal().getSigned(), message.getDeal().getPrice());
        dealService.saveDeal(deal);
    }
}