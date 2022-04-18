package svalyavakilia.projects.vacationplanningapp.model;

import java.util.HashMap;
import java.util.Map;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Item {
    private static int nextItemId = 0;
    private static final Map<Integer, Item> ITEMS = new HashMap<>();

    private String name;
    private int quantity;
    private boolean isPacked;

    {
        ITEMS.put((nextItemId)++, this);
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
}