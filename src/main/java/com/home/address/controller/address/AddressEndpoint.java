package com.home.address.controller.address;


import com.home.dtos.address.AddressDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/address")
public interface AddressEndpoint {

    @PostMapping
    ResponseEntity<AddressDTO> save(@RequestBody AddressDTO addressDTO);

    @GetMapping("/{id}")
    ResponseEntity<AddressDTO> getAddressById(Long id);
}
