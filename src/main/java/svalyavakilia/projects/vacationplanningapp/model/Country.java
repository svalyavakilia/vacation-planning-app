package svalyavakilia.projects.vacationplanningapp.model;

import java.util.HashMap;
import java.util.Map;

public class Country {
    private static int nextCountryId = 0;
    private static final Map<Integer, Country> COUNTRIES = new HashMap<>();

    private String name;

    {
        COUNTRIES.put((nextCountryId)++, this);
    }

    public Country(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}