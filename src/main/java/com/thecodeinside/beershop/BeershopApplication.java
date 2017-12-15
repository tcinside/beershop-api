package com.thecodeinside.beershop;

import com.thecodeinside.beershop.model.BeerStyle;
import com.thecodeinside.beershop.repository.BeerStyleRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeershopApplication {

    @Autowired
    private BeerStyleRepository beerStyleRepository;

    public static void main(String[] args) {
        SpringApplication.run(BeershopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Pilsener"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Indian Pale Ale"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Weissbier"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Porter"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("English Bitter"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Imperial Stout"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Doppelbock"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Dunkel"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Vienna lager"));
            beerStyleRepository.save(new BeerStyle().setId(null).setName("Witbier"));
        };
    }
}
