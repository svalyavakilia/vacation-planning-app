package svalyavakilia.projects.vacationplanningapp.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svalyavakilia.projects.vacationplanningapp.model.Item;
import svalyavakilia.projects.vacationplanningapp.model.Suitcase;
import svalyavakilia.projects.vacationplanningapp.repository.ItemRepository;
import svalyavakilia.projects.vacationplanningapp.repository.SuitcaseRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;
    private final SuitcaseRepository suitcaseRepository;

    @Autowired
    public ItemService(final ItemRepository itemRepository,
                       final SuitcaseRepository suitcaseRepository) {
        this.itemRepository = itemRepository;
        this.suitcaseRepository = suitcaseRepository;
    }

    public List<Item> getItems() {
        return itemRepository.getItems();
    }

    public boolean addItemToSuitcase(final int itemId, final int suitcaseId) {
        final Optional<Item> item = itemRepository.getItemById(itemId);

        if (item.isEmpty()) {
            throw new NoSuchElementException("No item with id " + itemId + "!");
        }

        final Optional<Suitcase> suitcase = suitcaseRepository.getSuitcaseById(
            suitcaseId
        );

        if (suitcase.isEmpty()) {
            throw new NoSuchElementException(
                "No suitcase with id " + suitcaseId + "!"
            );
        }

        return suitcase.get().addItem(item.get());
    }

    public void markItemAsPacked(final int id) {
        final Optional<Item> item = itemRepository.getItemById(id);

        if (item.isPresent()) {
            item.get().isPacked(true);
        } else {
            throw new NoSuchElementException("No item with id " + id + "!");
        }
    }

    public boolean removeItemFromSuitcase(final int itemId,
                                          final int suitcaseId) {
        final Optional<Item> item = itemRepository.getItemById(itemId);

        if (item.isEmpty()) {
            throw new NoSuchElementException("No item with id " + itemId + "!");
        }

        final Optional<Suitcase> suitcase = suitcaseRepository.getSuitcaseById(
            suitcaseId
        );

        if (suitcase.isEmpty()) {
            throw new NoSuchElementException(
                "No suitcase with id " + suitcaseId + "!"
            );
        }

        return suitcase.get().removeItem(item.get());
    }
}