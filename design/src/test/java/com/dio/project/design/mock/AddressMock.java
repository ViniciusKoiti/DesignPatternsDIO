package com.dio.project.design.mock;

import dto.AddressDTO;

public class AddressMock {

    public static AddressDTO createMockAddressDTO() {
        AddressDTO address = new AddressDTO();
        address.setStreet("123 Main St");
        address.setCity("Anytown");
        address.setState("Anystate");
        address.setZipCode("12345");
        return address;
    }
}
