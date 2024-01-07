package com.dio.project.design.dto;


import com.dio.project.design.common.validator.DataRange;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
@DataRange(startDate = "initialDateTime", endDate = "finalDateTime")
public class SchedulingDTO extends EventDTO{

    private long id;

    public SchedulingDTO() {
    }

    public SchedulingDTO(long id) {
        this.id = id;
    }

    public SchedulingDTO(long id, ZonedDateTime initialDateTime, ZonedDateTime finalTime) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
