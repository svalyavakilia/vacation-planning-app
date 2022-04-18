package svalyavakilia.projects.vacationplanningapp.repository;

import java.util.List;
import java.util.Optional;
import svalyavakilia.projects.vacationplanningapp.model.Item;

public interface ItemRepository {
    List<Item> getItems();

    Optional<Item> getItemById(final int id);
}