package com.example.demo.mapper;

import com.example.demo.dto.LectureDTO;
import com.example.demo.model.LectureModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LectureMapper {
    LectureDTO toDTO(LectureModel model);
    LectureModel toModel(LectureDTO dto);
}
