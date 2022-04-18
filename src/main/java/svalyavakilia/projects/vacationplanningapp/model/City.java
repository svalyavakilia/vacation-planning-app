package svalyavakilia.projects.vacationplanningapp.model;

import java.util.HashMap;
import java.util.Map;

public class City {
    private static int nextCityId = 0;
    private static final Map<Integer, City> CITIES = new HashMap<>();

    private String name;
    private Country country;

    {
        CITIES.put((nextCityId)++, this);
    }

    public City(final String name, final Country country) {
        this.name = name;
        this.country = country;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return this.country;
    }
}