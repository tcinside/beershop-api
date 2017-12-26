package com.thecodeinside.beershop.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Beer {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "beer_style_id", nullable = false)
    private BeerStyle style;

    @ManyToOne
    @JoinColumn(name = "brewing_company_id")
    private BrewingCompany brewingCompany;

    @Column
    private String name;

    @Column
    private BigDecimal price;
}
