package com.dio.project.design.mock;

import com.dio.project.design.dto.AddressDTO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddressMock {

    public static AddressDTO createMockAddressDTO() {
        AddressDTO address = new AddressDTO();
        address.setStreet("123 Main St");
        address.setCity("Anytown");
        address.setState("Anystate");
        address.setZipCode("12345");
        return address;
    }

    public static List<AddressDTO> createMockPersonDTOList(int size) {
        return IntStream.range(0, size)
                .mapToObj(i -> createMockAddressDTO())
                .collect(Collectors.toList());
    }
}
