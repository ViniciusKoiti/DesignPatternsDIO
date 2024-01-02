package common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import org.apache.commons.beanutils.BeanUtils;

public class DateRangeValidator implements ConstraintValidator<DataRange, Object> {

    private String startDate;
    private String endDate;

    @Override
    public void initialize(DataRange constraintAnnotation) {
        this.startDate = constraintAnnotation.startDate();
        this.endDate = constraintAnnotation.endDate();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        try {
            LocalDate start = LocalDate.parse(BeanUtils.getProperty(value, startDate));
            LocalDate end = LocalDate.parse(BeanUtils.getProperty(value, endDate));
            return start.isBefore(end) || start.isEqual(end);
        } catch (final Exception ignore) {
            // ignorar exceções, tratando como falha na validação
        }
        return false;
    }
}
