package com.dio.project.design.mock;

import dto.PersonDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.dio.project.design.mock.AddressMock.createMockAddressDTO;

public class PersonMock {

    public static PersonDTO createMockPersonDTO() {
        PersonDTO person = new PersonDTO();
        person.setName("John Doe");
        person.setAddress(createMockAddressDTO());
        person.setBalance(1000.00);
        return person;
    }

    public static List<PersonDTO> createMockPersonDTOList(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> createMockPersonDTO())
                .collect(Collectors.toList());
    }
}
