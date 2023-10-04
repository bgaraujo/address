package com.home.address.controller.address;

import com.home.dtos.address.*;
import com.home.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Address implements AddressEndpoint{

    @Autowired
    private AddressService addressService;
    @Override
    public ResponseEntity<AddressDTO> save(AddressDTO addressDTO) {
        return ResponseEntity.ok(addressService.save(addressDTO));
    }

    @Override
    public ResponseEntity<AddressDTO> getAddressById(Long id) {
        return null;
    }
}
