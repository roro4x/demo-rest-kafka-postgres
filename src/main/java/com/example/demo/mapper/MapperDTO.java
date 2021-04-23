package com.example.demo.mapper;

import com.example.demo.model.dto.CarDTO;
import com.example.demo.model.dto.ClientDTO;
import com.example.demo.model.dto.DealDTO;
import com.example.demo.model.dto.ManagerDTO;
import com.example.demo.model.entity.Car;
import com.example.demo.model.entity.Client;
import com.example.demo.model.entity.Deal;
import com.example.demo.model.entity.Manager;
import org.springframework.stereotype.Service;

@Service
public class MapperDTO {

    public Deal convertDealToEntity(DealDTO dealDTO) {
        Deal deal = new Deal();
        deal.setValue(dealDTO.getPrice().getValue());
        deal.setCurrency(dealDTO.getPrice().getCurrency());
        deal.setSigned(dealDTO.getSigned());
        return deal;
    }
    public Car convertCarToEntity(CarDTO carDTO) {
        Car car = new Car();
        car.setBrand(carDTO.getBrand());
        car.setModel(carDTO.getModel());
        car.setVin(carDTO.getVin());
        return car;
    }
    public Client convertClientToEntity(ClientDTO clientDTO) {
        Client client = new Client();
        client.setName(clientDTO.getName());
        client.setBirthDate(clientDTO.getBirthDate());
        client.setPhone(clientDTO.getPhone());
        return client;
    }
    public Manager convertManagerToEntity(ManagerDTO managerDTO) {
        Manager manager = new Manager();
        manager.setName(managerDTO.getName());
        manager.setPhone(managerDTO.getPhone());
        return manager;
    }
}
