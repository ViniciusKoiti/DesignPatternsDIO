package com.dio.project.design.mock;

import dto.PersonDTO;

import static com.dio.project.design.mock.AddressMock.createMockAddressDTO;

public class PersonMock {

    public static PersonDTO createMockPersonDTO() {
        PersonDTO person = new PersonDTO();
        person.setName("John Doe");
        person.setAddress(createMockAddressDTO());
        person.setBalance(1000.00);
        return person;
    }
}
