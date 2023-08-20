package com.example.demo.mapper;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.StudentModel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {LectureListMapper.class, LecturerListMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StudentMapper {
    StudentDTO toDTO(StudentModel model);
    StudentModel toModel(StudentDTO dto);
}
