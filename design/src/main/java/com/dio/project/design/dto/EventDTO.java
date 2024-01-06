package com.dio.project.design.dto;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

public class EventDTO {
    @NotNull
    private ZonedDateTime initialDateTime;
    @NotNull
    private ZonedDateTime finalDateTime;

    public ZonedDateTime getInitialDateTime() {
        return initialDateTime;
    }

    public void setInitialDateTime(ZonedDateTime initialDateTime) {
        this.initialDateTime = initialDateTime;
    }

    public ZonedDateTime getFinalDateTime() {
        return finalDateTime;
    }

    public void setFinalDateTime(ZonedDateTime finalDateTime) {
        this.finalDateTime = finalDateTime;
    }
}
