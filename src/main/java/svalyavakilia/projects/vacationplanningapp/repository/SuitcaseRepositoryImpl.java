package svalyavakilia.projects.vacationplanningapp.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import svalyavakilia.projects.vacationplanningapp.model.Suitcase;

@Repository
public class SuitcaseRepositoryImpl implements SuitcaseRepository {
    private final Map<Integer, Suitcase> suitcases;

    {
        this.suitcases = Suitcase.getSuitcases();
    }

    @Override
    public List<Suitcase> getSuitcases() {
        return suitcases
            .values()
            .stream()
            .toList();
    }

    @Override
    public Optional<Suitcase> getSuitcaseById(final int id) {
        if (suitcases.containsKey(id)) {
            return Optional.of(suitcases.get(id));
        }

        return Optional.empty();
    }

    @Override
    public List<Suitcase> getSuitcasesByString(final String string) {
        return suitcases
            .values()
            .stream()
            .filter(suitcase -> suitcase.getName().contains(string))
            .toList();
    }

    @Override
    public void deleteSuitcaseById(final int id) {
        suitcases.remove(id);
    }
}