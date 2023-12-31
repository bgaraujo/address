package com.home.address.service.impl;

import com.home.address.entity.Address;
import com.home.address.repository.AddressRepository;
import com.home.address.repository.LocationRepository;
import com.home.address.service.AddressService;
import com.home.dtos.address.AddressDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AddressDTO save(AddressDTO addressDTO) {
        Address address = modelMapper.map(addressDTO, Address.class);
        address.getLocation().setId(locationRepository.save(address.getLocation()).getId());
        address.setId(addressRepository.save(address).getId());
        return modelMapper.map(address, AddressDTO.class);
    }
}
