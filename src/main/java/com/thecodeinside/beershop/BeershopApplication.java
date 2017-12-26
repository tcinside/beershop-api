package com.thecodeinside.beershop;

import static java.util.Arrays.asList;

import com.thecodeinside.beershop.model.Beer;
import com.thecodeinside.beershop.model.BeerStyle;
import com.thecodeinside.beershop.model.BrewingCompany;
import com.thecodeinside.beershop.repository.BeerRepository;
import com.thecodeinside.beershop.repository.BeerStyleRepository;
import com.thecodeinside.beershop.repository.BrewingCompanyRepository;
import java.math.BigDecimal;
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

    @Autowired
    private BeerRepository beerRepository;

    public static void main(String[] args) {
        SpringApplication.run(BeershopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            BrewingCompany dama = new BrewingCompany().setName("Dama Bier");
            BrewingCompany bamberg = new BrewingCompany().setName("Bamberg");
            BrewingCompany kalango = new BrewingCompany().setName("Kalango");
            BrewingCompany invicta = new BrewingCompany().setName("Invicta");
            asList(dama, bamberg, kalango, invicta)
                .forEach(brewingCompanyRepository::save);

            BeerStyle pilsener = new BeerStyle().setName("Pilsener");
            BeerStyle ipa = new BeerStyle().setName("Indian Pale Ale - IPA");
            BeerStyle aipa = new BeerStyle().setName("American IPA");
            BeerStyle weissbier = new BeerStyle().setName("Weissbier");
            BeerStyle dunkel = new BeerStyle().setName("Dunkel");
            BeerStyle viennaLager = new BeerStyle().setName("Vienna lager");
            BeerStyle witbier = new BeerStyle().setName("Witbier");

            asList(pilsener, ipa, aipa, weissbier, dunkel, viennaLager, witbier)
                .forEach(beerStyleRepository::save);

            Beer damaIPA = new Beer().setBrewingCompany(dama).setStyle(aipa).setName("IPA").setPrice(bigDecimal("20.5", 2));

            asList(damaIPA).forEach(beerRepository::save);
        };
    }

    private BigDecimal bigDecimal(String value, int scale) {
        return new BigDecimal(value).setScale(scale);
    }
}
