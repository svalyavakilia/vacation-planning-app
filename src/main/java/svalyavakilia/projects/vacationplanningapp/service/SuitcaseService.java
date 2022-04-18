package svalyavakilia.projects.vacationplanningapp.service;

import java.util.NoSuchElementException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import svalyavakilia.projects.vacationplanningapp.model.Suitcase;
import svalyavakilia.projects.vacationplanningapp.repository.SuitcaseRepository;

@Service
public class SuitcaseService {
    private final SuitcaseRepository suitcaseRepository;

    @Autowired
    public SuitcaseService(final SuitcaseRepository suitcaseRepository) {
        this.suitcaseRepository = suitcaseRepository;
    }

    public List<Suitcase> getSuitcases() {
        return suitcaseRepository.getSuitcases();
    }

    public Suitcase getSuitcaseById(final int id) {
        final Optional<Suitcase> suitcase = suitcaseRepository.getSuitcaseById(
            id
        );

        if (suitcase.isPresent()) {
            return suitcase.get();
        }

        throw new NoSuchElementException("No suitcase with id " + id + "!");
    }

    public List<Suitcase> getSuitcasesByString(final String string) {
        return suitcaseRepository.getSuitcasesByString(string);
    }

    public void deleteSuitcaseById(final int id) {
        final Optional<Suitcase> suitcase = suitcaseRepository.getSuitcaseById(
            id
        );

        if (suitcase.isPresent()) {
            suitcaseRepository.deleteSuitcaseById(id);
        } else {
            throw new NoSuchElementException("No suitcase with id " + id + "!");
        }
    }
}