package com.example.demo.mapper;

import com.example.demo.dto.SeguroDTO;
import com.example.demo.repository.entity.Seguro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SeguroMapper {
    SeguroMapper INSTANCE = Mappers.getMapper(SeguroMapper.class);

    SeguroDTO seguroToSeguroDTO(Seguro seguro);
}
