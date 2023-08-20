package com.example.demo.mapper;

import com.example.demo.dto.StudentDTO;
import com.example.demo.model.LectureModel;
import com.example.demo.model.LecturerModel;
import com.example.demo.model.StudentModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void shouldProperlyMapStudentToDto() {
        StudentModel studentModel = new StudentModel();
        studentModel.setId(1L);
        studentModel.setName("Ivan");

        LectureModel lectureModel = new LectureModel();
        lectureModel.setId(2L);
        lectureModel.setName("Matan");

        studentModel.setLectures(singletonList(lectureModel));

        LecturerModel lecturerModel = new LecturerModel();

        lecturerModel.setId(3L);
        lecturerModel.setName("Vladimir Kirillovich");

        studentModel.setLecturers(singletonList(lecturerModel));

        StudentDTO studentDTO = studentMapper.toDTO(studentModel);

        assertNotNull(studentDTO);
        assertEquals(1L, studentDTO.getId());
        assertEquals("Ivan", studentDTO.getName());

        assertEquals(1, studentDTO.getLecturers().size());
        assertEquals(2L, studentDTO.getLectures().get(0).getId());
        assertEquals("Matan", studentDTO.getLectures().get(0).getName());

        assertEquals(1, studentDTO.getLectures().size());
        assertEquals(3L, studentDTO.getLecturers().get(0).getId());
        assertEquals("Vladimir Kirillovich", studentDTO.getLecturers().get(0).getName());
    }
}
