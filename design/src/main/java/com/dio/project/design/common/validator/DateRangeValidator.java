package com.dio.project.design.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.ZonedDateTime;

import com.dio.project.design.dto.EventDTO;

public class DateRangeValidator implements ConstraintValidator<DataRange,EventDTO> {

    private String startDateFieldName;
    private String endDateFieldName;


    @Override
    public void initialize(DataRange constraintAnnotation) {
        this.startDateFieldName = constraintAnnotation.startDate();
        this.endDateFieldName = constraintAnnotation.endDate();
    }

    @Override
    public boolean isValid(EventDTO eventDTO, ConstraintValidatorContext constraintValidatorContext) {
        ZonedDateTime start = eventDTO.getInitialDateTime();
        ZonedDateTime end = eventDTO.getFinalDateTime();
        return start.isBefore(end) || start.isEqual(end);
    }
}

