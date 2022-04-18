package svalyavakilia.projects.vacationplanningapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import svalyavakilia.projects.vacationplanningapp.model.Suitcase;
import svalyavakilia.projects.vacationplanningapp.service.SuitcaseService;

@RestController
@RequestMapping(path = {"/api/suitcase"})
public class SuitcaseController {
    private final SuitcaseService suitcaseService;

    @Autowired
    public SuitcaseController(final SuitcaseService suitcaseService) {
        this.suitcaseService = suitcaseService;
    }

    @GetMapping
    public List<Suitcase> getSuitcase() {
        return suitcaseService.getSuitcases();
    }

    @GetMapping(path = {"/{id}"})
    public Suitcase getSuitcaseById(@PathVariable(value = "id") final int id) {
        return suitcaseService.getSuitcaseById(id);
    }

    @GetMapping(path = {"/search/{string}"})
    public List<Suitcase>
    getSuitcasesByString(@PathVariable(value = "string") final String string) {
        return suitcaseService.getSuitcasesByString(string);
    }

    @DeleteMapping(path = {"/{id}"})
    public void deleteSuitcaseById(@PathVariable(value = "id") final int id) {
        suitcaseService.deleteSuitcaseById(id);
    }
}