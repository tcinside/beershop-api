package com.thecodeinside.beershop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BrewingCompany {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
