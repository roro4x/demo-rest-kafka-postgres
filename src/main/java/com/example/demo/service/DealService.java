package com.example.demo.service;

import com.example.demo.mapper.MapperDTO;
import com.example.demo.model.dto.DealInputDTO;
import com.example.demo.repository.CarRepository;
import com.example.demo.repository.ClientRepository;
import com.example.demo.repository.DealRepository;
import com.example.demo.repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class DealService {

    private final CarRepository carRepository;
    private final ClientRepository clientRepository;
    private final DealRepository dealRepository;
    private final ManagerRepository managerRepository;
    private final MapperDTO mapperDTO;

    @Transactional
    public void saveData(DealInputDTO message) {
        clientRepository.save(mapperDTO.convertClientToEntity(message.getClient()));
        carRepository.save(mapperDTO.convertCarToEntity(message.getCar()));
        dealRepository.save(mapperDTO.convertDealToEntity(message.getDeal()));
        managerRepository.save(mapperDTO.convertManagerToEntity(message.getManager()));
    }
}
