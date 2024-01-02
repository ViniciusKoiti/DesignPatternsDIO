package dto;

import java.time.ZonedDateTime;

public class EventDTO {

    private ZonedDateTime initialDateTime;

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
