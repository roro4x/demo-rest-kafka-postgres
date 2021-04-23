package com.example.demo;

import com.example.demo.mapper.MapperDTO;
import com.example.demo.model.dto.CarDTO;
import com.example.demo.model.entity.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertEquals;

@SpringBootTest
public class MapperDTOTests {

    private final MapperDTO mapperDTO = new MapperDTO();

    @Test
    public void whenConvertClientDTO() {
        CarDTO carDTO = new CarDTO();
        carDTO.setBrand("Suzuki");
        carDTO.setVin("32524tgfdsg3y35q734773124734");
        carDTO.setModel("Splash");
        Car car = new Car();
        car = mapperDTO.convertCarToEntity(carDTO);
        assertEquals(carDTO.getBrand(), car.getBrand());
        assertEquals(carDTO.getModel(), car.getModel());
        assertEquals(carDTO.getVin(), car.getVin());
    }


}
