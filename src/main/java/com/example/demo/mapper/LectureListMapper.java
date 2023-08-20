package com.example.demo.mapper;

import com.example.demo.dto.LectureDTO;
import com.example.demo.model.LectureModel;
import com.example.demo.model.LecturerModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = LectureMapper.class)
public interface LectureListMapper {
    List<LectureModel> toModelList(List<LectureDTO> dtos);
    List<LectureDTO> toDTOList(List<LecturerModel> models);
}
