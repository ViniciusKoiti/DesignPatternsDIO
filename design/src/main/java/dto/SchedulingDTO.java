package dto;


import common.validator.DataRange;

import java.time.ZonedDateTime;
@DataRange(startDate = "initialDateTime", endDate = "finalDateTime")
public class SchedulingDTO {

    private long id;

    private ZonedDateTime initialDateTime;

    private ZonedDateTime finalDateTime;

    private ClientDTO client;

    private ProfissionalDTO professional;

    public SchedulingDTO() {
    }

    public SchedulingDTO(long id, ZonedDateTime initialDateTime, ZonedDateTime finalTime, ClientDTO client, ProfissionalDTO profissional) {
        this.id = id;
        this.initialDateTime = initialDateTime;
        this.finalDateTime = finalTime;
        this.client = client;
        this.professional = profissional;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public ProfissionalDTO getProfissional() {
        return professional;
    }

    public void setProfissional(ProfissionalDTO profissional) {
        this.professional = profissional;
    }
}
