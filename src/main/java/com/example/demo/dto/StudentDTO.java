package com.example.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private List<LectureDTO> lectures;
    private List<LectureDTO> lecturers;
}
