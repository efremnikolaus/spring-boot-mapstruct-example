package com.example.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class StudentModel {
    private Long id;
    private String name;
    private List<LectureModel> lectures;
    private List<LecturerModel> lecturers;
}
