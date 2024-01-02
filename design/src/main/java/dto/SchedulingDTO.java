package dto;


import java.time.ZonedDateTime;

public class SchedulingDTO {

    private long id;


    private ZonedDateTime initialTime;

    private ZonedDateTime finalTime;

    private ClientDTO client;

    private ProfissionalDTO profissional;

    public SchedulingDTO() {
    }

    public SchedulingDTO(long id, ZonedDateTime initialTime, ZonedDateTime finalTime, ClientDTO client, ProfissionalDTO profissional) {
        this.id = id;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.client = client;
        this.profissional = profissional;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ZonedDateTime getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(ZonedDateTime initialTime) {
        this.initialTime = initialTime;
    }

    public ZonedDateTime getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(ZonedDateTime finalTime) {
        this.finalTime = finalTime;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public ProfissionalDTO getProfissional() {
        return profissional;
    }

    public void setProfissional(ProfissionalDTO profissional) {
        this.profissional = profissional;
    }
}
