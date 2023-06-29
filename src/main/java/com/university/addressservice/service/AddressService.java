package com.university.addressservice.service;

import com.university.addressservice.entity.Address;
import com.university.addressservice.entity.AddressDto;

public interface AddressService {

    AddressDto addAddress(AddressDto addressDto);

    AddressDto getAddress(long id);

}
