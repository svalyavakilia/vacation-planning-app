package svalyavakilia.projects.vacationplanningapp.repository;

import java.util.List;
import java.util.Optional;
import svalyavakilia.projects.vacationplanningapp.model.Suitcase;

public interface SuitcaseRepository {
    List<Suitcase> getSuitcases();

    Optional<Suitcase> getSuitcaseById(final int id);

    List<Suitcase> getSuitcasesByString(final String string);

    void deleteSuitcaseById(final int id);
}