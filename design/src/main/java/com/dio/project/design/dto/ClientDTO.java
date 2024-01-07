package com.dio.project.design.dto;


import java.util.List;

public class ClientDTO extends PersonDTO {

    private List<SchedulingDTO> schedulingList;

    public List<SchedulingDTO> getSchedulingList() {
        return schedulingList;
    }

    public void setSchedulingList(List<SchedulingDTO> schedulingList) {
        this.schedulingList = schedulingList;
    }
}
