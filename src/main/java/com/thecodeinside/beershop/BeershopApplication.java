package com.thecodeinside.beershop;

import com.thecodeinside.beershop.model.BeerStyle;
import com.thecodeinside.beershop.model.BrewingCompany;
import com.thecodeinside.beershop.repository.BeerStyleRepository;
import com.thecodeinside.beershop.repository.BrewingCompanyRepository;
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

    @Autowired
    private BrewingCompanyRepository brewingCompanyRepository;

    public static void main(String[] args) {
        SpringApplication.run(BeershopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            brewingCompanyRepository.save(new BrewingCompany().setName("Dama Bier"));
            brewingCompanyRepository.save(new BrewingCompany().setName("Bamberg"));
            brewingCompanyRepository.save(new BrewingCompany().setName("Kalango"));
            brewingCompanyRepository.save(new BrewingCompany().setName("Invicta"));

            beerStyleRepository.save(new BeerStyle().setName("Pilsener"));
            beerStyleRepository.save(new BeerStyle().setName("Indian Pale Ale"));
            beerStyleRepository.save(new BeerStyle().setName("Weissbier"));
            beerStyleRepository.save(new BeerStyle().setName("Porter"));
            beerStyleRepository.save(new BeerStyle().setName("English Bitter"));
            beerStyleRepository.save(new BeerStyle().setName("Imperial Stout"));
            beerStyleRepository.save(new BeerStyle().setName("Doppelbock"));
            beerStyleRepository.save(new BeerStyle().setName("Dunkel"));
            beerStyleRepository.save(new BeerStyle().setName("Vienna lager"));
            beerStyleRepository.save(new BeerStyle().setName("Witbier"));
        };
    }
}
