package com.thecodeinside.beershop.repository;

import com.thecodeinside.beershop.model.BeerStyle;
import org.springframework.data.repository.CrudRepository;

public interface BeerStyleRepository extends CrudRepository<BeerStyle, Long> {
}
