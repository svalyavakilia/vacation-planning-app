package svalyavakilia.projects.vacationplanningapp.repository;

import java.util.List;
import java.util.Optional;
import java.util.Map;
import org.springframework.stereotype.Repository;
import svalyavakilia.projects.vacationplanningapp.model.Item;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private final Map<Integer, Item> items;

    {
        this.items = Item.getItems();
    }

    @Override
    public List<Item> getItems() {
        return items
            .values()
            .stream()
            .toList();
    }

    @Override
    public Optional<Item> getItemById(final int id) {
        if (items.containsKey(id)) {
            return Optional.of(items.get(id));
        }

        return Optional.empty();
    }
}