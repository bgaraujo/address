package com.home.address.entity;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String postalCode;
    private String street;
    private Long number;
    private String state;
    private String city;
    private String complement;

    @OneToOne
    private Location location;


}
