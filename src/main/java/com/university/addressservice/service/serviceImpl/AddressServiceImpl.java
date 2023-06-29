package com.university.addressservice.service.serviceImpl;

import com.university.addressservice.entity.Address;
import com.university.addressservice.entity.AddressDto;
import com.university.addressservice.repository.AddressRepository;
import com.university.addressservice.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public AddressDto addAddress(AddressDto addressDto) {
        Address ad=new Address();
        ad.setStreet(addressDto.getStreet());
        ad.setCity(addressDto.getCity());
        return mapToDto(addressRepository.save(ad));
    }

    @Override
    public AddressDto getAddress(long id) {
        log.info("inside get Address");
        Address address=addressRepository.findById(id).get();
        return mapToDto(address);
    }


    public AddressDto mapToDto(Address address){
        AddressDto adDto=new AddressDto();
        adDto.setCity(address.getCity());
        adDto.setStreet(address.getStreet());
        return adDto;
    }


}
