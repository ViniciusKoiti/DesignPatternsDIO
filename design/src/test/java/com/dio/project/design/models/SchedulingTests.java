package com.dio.project.design.models;

import com.dio.project.design.common.validator.DateRangeValidator;
import com.dio.project.design.controller.impl.SchedulingController;
import com.dio.project.design.dto.SchedulingDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import com.dio.project.design.service.SchedulingService;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(SchedulingController.class)
public class SchedulingTests {
    private final DateRangeValidator validator = new DateRangeValidator();


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


}


