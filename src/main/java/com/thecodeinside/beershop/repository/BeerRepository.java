package com.thecodeinside.beershop.repository;

import com.thecodeinside.beershop.model.Beer;
import org.springframework.data.repository.CrudRepository;

public interface BeerRepository extends CrudRepository<Beer, Long> {
}
