package com.example.demo.mapper;

import com.example.demo.dto.LecturerDTO;
import com.example.demo.model.LecturerModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = LecturerMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LecturerListMapper {
    List<LecturerModel> toModelList(List<LecturerDTO> dtoList);
    List<LecturerDTO> toDTOList(List<LecturerModel> modelList);
}
