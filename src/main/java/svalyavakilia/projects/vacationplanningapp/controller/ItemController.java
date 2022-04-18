package svalyavakilia.projects.vacationplanningapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}