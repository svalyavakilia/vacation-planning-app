package svalyavakilia.projects.vacationplanningapp.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import svalyavakilia.projects.vacationplanningapp.model.*;

@Configuration
public class AppConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner() {
        return (final String... arguments) -> {
            final User svalyavakilia = new User(
                "svalyavakilia", "s21211@pjwstk.edu.pl", "java"
            );

            final Country ukraine = new Country("Ukraine");
            final Country unitedKingdom = new Country("United Kingdom");
            final Country canada = new Country("Canada");

            final City kharkiv = new City("Kharkiv", ukraine);
            final City kyiv = new City("Kyiv", ukraine);
            final City london = new City("London", unitedKingdom);
            final City manchester = new City("Manchester", unitedKingdom);
            final City toronto = new City("Toronto", canada);
            final City vancouver = new City("Vancouver", canada);

            final Item hat = new Item("Hat", 2, true);
            final Item pants = new Item("Pants", 2, false);
            final Item sweeter = new Item("Sweeter", 3, true);
            final Item socks = new Item("Socks", 8, true);
            final Item tShirt = new Item("T-shirt", 2, false);
            final Item boxers = new Item("Boxers", 4, true);

            final Suitcase s0 = new Suitcase(
                "to Kharkiv", kharkiv,svalyavakilia
            );
            final Suitcase s1 = new Suitcase(
                "to London", london, svalyavakilia
            );

            s0.addItem(hat);
            s0.addItem(sweeter);
            s1.addItem(pants);
            s1.addItem(socks);
        };
    }
}