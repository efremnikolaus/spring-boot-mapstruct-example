package com.example.demo.mapper;

import com.example.demo.dto.LectureDTO;
import com.example.demo.model.LectureModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LectureMapper {
    LectureDTO toDTO(LectureModel model);
    LectureModel toModel(LectureDTO dto);
}
