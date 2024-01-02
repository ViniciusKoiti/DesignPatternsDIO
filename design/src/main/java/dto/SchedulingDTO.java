package dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import common.validator.DataRange;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
@DataRange(startDate = "initialDateTime", endDate = "finalDateTime")
public class SchedulingDTO extends EventDTO{


    private long id;

    @NotNull
    private ClientDTO client;
    @NotNull
    private ProfissionalDTO professional;

    public SchedulingDTO() {
    }

    public SchedulingDTO(long id, ZonedDateTime initialDateTime, ZonedDateTime finalTime, ClientDTO client, ProfissionalDTO profissional) {
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

    public ProfissionalDTO getProfissional() {
        return professional;
    }

    public void setProfissional(ProfissionalDTO profissional) {
        this.professional = profissional;
    }
}
