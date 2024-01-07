package com.dio.project.design.dto;

import java.util.List;

public class ProfessionalDTO extends PersonDTO {

    private String cpf;

    private List<SchedulingDTO> schedulingList;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<SchedulingDTO> getSchedulingList() {
        return schedulingList;
    }

    public void setSchedulingList(List<SchedulingDTO> schedulingList) {
        this.schedulingList = schedulingList;
    }
}
