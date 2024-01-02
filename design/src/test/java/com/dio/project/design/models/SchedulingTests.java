package com.dio.project.design.models;

import common.validator.DateRangeValidator;
import dto.SchedulingDTO;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
