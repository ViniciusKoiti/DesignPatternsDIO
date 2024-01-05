package com.dio.project.design.models;

import common.validator.DateRangeValidator;
import controller.impl.SchedulingController;
import dto.SchedulingDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import service.SchedulingService;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(SchedulingController.class)
public class SchedulingTests {
    private final DateRangeValidator validator = new DateRangeValidator();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SchedulingService schedulingService;

    @Test
    void testValidDateRange() {
        SchedulingDTO scheduling = new SchedulingDTO();
        scheduling.setInitialDateTime(ZonedDateTime.of(2021, 1, 1, 10, 0, 0, 0, ZoneId.of("UTC")));
        scheduling.setFinalDateTime(ZonedDateTime.of(2021, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC")));

        assertTrue(validator.isValid(scheduling, null));
    }

    @Test
    void testInvalidDateRange() {
        SchedulingDTO scheduling = new SchedulingDTO();
        scheduling.setInitialDateTime(ZonedDateTime.of(2021, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC")));
        scheduling.setFinalDateTime(ZonedDateTime.of(2021, 1, 1, 10, 0, 0, 0, ZoneId.of("UTC")));

        assertFalse(validator.isValid(scheduling, null));
    }

    @Test
    void testFinalAfterInitial() {
        SchedulingDTO scheduling = new SchedulingDTO();
        scheduling.setInitialDateTime(ZonedDateTime.of(2021, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC")));
        scheduling.setFinalDateTime(ZonedDateTime.of(2020, 1, 1, 10, 0, 0, 0, ZoneId.of("UTC")));
        assertFalse(validator.isValid(scheduling, null));
    }

    @BeforeEach
    void setUp(){
        SchedulingDTO mockScheduling = new SchedulingDTO();
        mockScheduling.setId(1L);
        ResponseEntity<SchedulingDTO> responseEntity = ResponseEntity.ok(mockScheduling);
        when(schedulingService.getById(1L)).thenReturn(responseEntity);
    }

    @Test
    void getSchedulingByIdShouldReturnScheduling() throws Exception {
        mockMvc.perform(get("/scheduling/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1L));
    }
}


