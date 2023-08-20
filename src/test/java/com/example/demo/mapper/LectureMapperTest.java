package com.example.demo.mapper;

import com.example.demo.dto.LectureDTO;
import com.example.demo.model.LectureModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LectureMapperTest {

    @Autowired
    private LectureMapper mapperUnderTest;

    @Test
    void shouldProperlyMapModelToDto() {
        LectureModel model = new LectureModel();
        model.setId(11L);
        model.setName("lecture name");

        LectureDTO dto = mapperUnderTest.toDTO(model);

        Assertions.assertNotNull(dto);
        Assertions.assertEquals(model.getId(), dto.getId());
        Assertions.assertEquals(model.getName(), dto.getName());
    }

    @Test
    void shouldProperlyMapDtoToModel() {
        LectureDTO dto = new LectureDTO();
        dto.setId(11L);
        dto.setName("lecture name");

        LectureModel model = mapperUnderTest.toModel(dto);

        Assertions.assertNotNull(model);
        Assertions.assertEquals(dto.getId(), model.getId());
        Assertions.assertEquals(dto.getName(), model.getName());
    }
}
