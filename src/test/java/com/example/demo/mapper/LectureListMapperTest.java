package com.example.demo.mapper;

import com.example.demo.dto.LectureDTO;
import com.example.demo.model.LectureModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class LectureListMapperTest {

    private final LectureListMapper lectureListMapper = new LectureListMapperImpl(new LectureMapperImpl());

    @Test
    void shouldProperlyMapListDtosToListModels() {
        LectureDTO dto = new LectureDTO();
        dto.setId(12L);
        dto.setName("I'm BATMAN!");

        List<LectureDTO> dtos = Collections.singletonList(dto);

        List<LectureModel> models = lectureListMapper.toModelList(dtos);

        Assertions.assertNotNull(models);
        Assertions.assertEquals(1, models.size());
        Assertions.assertEquals(dto.getId(), models.get(0).getId());
        Assertions.assertEquals(dto.getName(), models.get(0).getName());
    }
}
