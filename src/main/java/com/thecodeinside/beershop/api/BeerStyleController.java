package com.thecodeinside.beershop.api;

import com.thecodeinside.beershop.model.BeerStyle;
import com.thecodeinside.beershop.repository.BeerStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beer-style")
public class BeerStyleController {

    @Autowired
    private BeerStyleRepository repository;

    @RequestMapping("/")
    public Iterable<BeerStyle> index() {
        return repository.findAll();
    }
}
