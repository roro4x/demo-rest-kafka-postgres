package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealInputDTO {
    private CarDTO car;
    private ClientDTO client;
    private DealDTO deal;
    private ManagerDTO manager;
}
