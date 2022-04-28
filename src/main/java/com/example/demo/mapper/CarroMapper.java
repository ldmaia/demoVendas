package com.example.demo.mapper;

import com.example.demo.dto.CarroDTO;
import com.example.demo.repository.entity.Carro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(uses = {SeguroMapper.class})
public interface CarroMapper {
    CarroMapper INSTANCE = Mappers.getMapper(CarroMapper.class);

    CarroDTO carroToCarroDTO(Carro carro);
}
