package com.dio.project.design.dto;


import com.dio.project.design.common.validator.DataRange;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
@DataRange(startDate = "initialDateTime", endDate = "finalDateTime")
public class SchedulingDTO extends EventDTO{

    private long id;

    @NotNull
    private ClientDTO client;
    @NotNull
    private ProfessionalDTO professional;

    public SchedulingDTO() {
    }

    public SchedulingDTO(long id, ZonedDateTime initialDateTime, ZonedDateTime finalTime, ClientDTO client, ProfessionalDTO profissional) {
        this.id = id;
        this.client = client;
        this.professional = profissional;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public ProfessionalDTO getProfissional() {
        return professional;
    }

    public void setProfissional(ProfessionalDTO profissional) {
        this.professional = profissional;
    }
}
