package com.thecodeinside.beershop.api;

import com.thecodeinside.beershop.model.BeerStyle;
import com.thecodeinside.beershop.model.BrewingCompany;
import com.thecodeinside.beershop.repository.BeerStyleRepository;
import com.thecodeinside.beershop.repository.BrewingCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brewing-company")
public class BrewingCompanyController {

    @Autowired
    private BrewingCompanyRepository repository;

    @GetMapping
    public Iterable<BrewingCompany> index() {
        return repository.findAll();
    }
}
