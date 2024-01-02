package common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Method;
import java.time.ZonedDateTime;

import dto.EventDTO;
import org.apache.commons.beanutils.BeanUtils;

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

