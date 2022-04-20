package svalyavakilia.projects.vacationplanningapp.model;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Suitcase {
    private static int nextSuitcaseId = 0;
    private static final Map<Integer, Suitcase> SUITCASES;

    static {
        SUITCASES = new LinkedHashMap<>();
    }

    private final int id;
    private String name;
    private City city;
    private User user;
    private final Set<Item> items;

    {
        id = (nextSuitcaseId)++;
        items = new LinkedHashSet<>();

        SUITCASES.put(this.id, this);
    }

    public Suitcase(final String name, final City city, final User user) {
        this.name = name;
        this.city = city;
        this.user = user;
    }

    public static Map<Integer, Suitcase> getSuitcases() {
        return Suitcase.SUITCASES;
    }

    public Set<Item> getItems() {
        return Set.copyOf(this.items);
    }

    public boolean addItem(final Item item) {
        return this.items.add(item);
    }

    public boolean removeItem(final Item item) {
        return this.items.remove(item);
    }

    public int getId() {
        return this.id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(final City city) {
        this.city = city;
    }

    public City getCity() {
        return this.city;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}