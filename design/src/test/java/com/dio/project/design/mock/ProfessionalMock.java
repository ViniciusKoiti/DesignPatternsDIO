package com.dio.project.design.mock;

import dto.PersonDTO;
import dto.ProfessionalDTO;

import static com.dio.project.design.mock.PersonMock.createMockPersonDTO;

public class ProfessionalMock {

    public static ProfessionalDTO createMockProfessionalDTO() {
        ProfessionalDTO client = new ProfessionalDTO();
        PersonDTO mockPerson = createMockPersonDTO();
        client.setName(mockPerson.getName());
        client.setAddress(mockPerson.getAddress());
        client.setBalance(mockPerson.getBalance());
        return client;
    }
}
