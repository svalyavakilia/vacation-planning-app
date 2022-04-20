package svalyavakilia.projects.vacationplanningapp.model;

import java.util.HashMap;
import java.util.Map;

public class Item {
    private static int nextItemId = 0;
    private static final Map<Integer, Item> ITEMS = new HashMap<>();

    private final int id;
    private String name;
    private int quantity;
    private boolean isPacked;

    {
        id = (nextItemId)++;

        ITEMS.put(this.id, this);
    }

    public Item(final String name,
                final int quantity,
                final boolean isPacked) {
        this.name = name;
        this.quantity = quantity;
        this.isPacked = isPacked;
    }

    public static Map<Integer, Item> getItems() {
        return ITEMS;
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

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void isPacked(final boolean isPacked) {
        this.isPacked = isPacked;
    }

    public boolean isPacked() {
        return this.isPacked;
    }

    @Override
    public boolean equals(final Object object) {
        if (object instanceof Item that) {
            return this.id == that.id;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}