package com.example.demo.mapper;

import com.example.demo.dto.LecturerDTO;
import com.example.demo.model.LecturerModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LecturerMapper {
    LecturerDTO toDTO(LecturerModel model);
    LecturerModel toModel(LecturerDTO dto);
}
