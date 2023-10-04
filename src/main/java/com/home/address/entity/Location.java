package com.home.address.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal lat;
    private BigDecimal lng;
}
