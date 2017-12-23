package com.thecodeinside.beershop.api;

import com.thecodeinside.beershop.model.Beer;
import com.thecodeinside.beershop.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    private BeerRepository repository;

    @GetMapping
    public Iterable<Beer> index() {
        return repository.findAll();
    }
}
