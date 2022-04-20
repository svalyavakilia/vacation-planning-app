package svalyavakilia.projects.vacationplanningapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import svalyavakilia.projects.vacationplanningapp.model.Item;
import svalyavakilia.projects.vacationplanningapp.service.ItemService;

@RestController
@RequestMapping(path = {"/api/item"})
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getItems() {
        return itemService.getItems();
    }

    @PostMapping(path = {"/{itemId}/{suitcaseId}"})
    public boolean addItemToSuitcase(@PathVariable(value = "itemId")
                                     final int itemId,
                                     @PathVariable(value = "suitcaseId")
                                     final int suitcaseId) {
        return itemService.addItemToSuitcase(itemId, suitcaseId);
    }

    @PostMapping(path = {"/set-packed/{id}"})
    public void markItemAsPacked(@PathVariable(value = "id") final int id) {
        itemService.markItemAsPacked(id);
    }

    @DeleteMapping(path = {"/delete-from-suitcase/{itemId}/{suitcaseId}"})
    public boolean removeItemFromSuitcase(@PathVariable(value = "itemId")
                                          final int itemId,
                                          @PathVariable(value = "suitcaseId")
                                          final int suitcaseId) {
        return itemService.removeItemFromSuitcase(itemId, suitcaseId);
    }
}