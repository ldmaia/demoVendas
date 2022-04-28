package com.example.demo.mapper;

import com.example.demo.dto.CarroDTO;
import com.example.demo.repository.entity.Carro;
import com.example.demo.repository.entity.Seguro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroMapperTest {

    private static final CarroMapper mapper = CarroMapper.INSTANCE;

    @Test
    public void carroMapperTest() {
        final Carro carroMock = carroMock();
        final CarroDTO carroDTO = mapper.carroToCarroDTO(carroMock);

        assertEquals(carroMock.getName(), carroDTO.getName());
        assertEquals(carroMock.getSeguro().getName() , carroDTO.getSeguro().getName());
    }

    public Carro carroMock() {
        Carro carro = new Carro();
        Seguro seguro = new Seguro();

        seguro.setName("Seguro do Tipo A");

        carro.setName("Celta");

        carro.setSeguro(seguro);

        return carro;
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme