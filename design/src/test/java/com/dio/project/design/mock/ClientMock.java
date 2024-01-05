package com.dio.project.design.mock;

import dto.ClientDTO;
import dto.PersonDTO;

import static com.dio.project.design.mock.PersonMock.createMockPersonDTO;

public class ClientMock {

    public static ClientDTO createMockClientDTO() {
        ClientDTO client = new ClientDTO();
        PersonDTO mockPerson = createMockPersonDTO();
        client.setName(mockPerson.getName());
        client.setAddress(mockPerson.getAddress());
        client.setBalance(mockPerson.getBalance());
        return client;
    }
}
