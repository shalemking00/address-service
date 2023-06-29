package com.university.addressservice.controller;

import com.university.addressservice.entity.AddressDto;
import com.university.addressservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/add")
    public ResponseEntity<AddressDto> addAddress(@RequestBody AddressDto addressDto){
        return new ResponseEntity<>(addressService.addAddress(addressDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> getAddress(@PathVariable("id") long id){
        return new ResponseEntity<>(addressService.getAddress(id), HttpStatus.OK);
    }



}
