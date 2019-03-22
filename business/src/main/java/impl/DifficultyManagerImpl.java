package impl;


import contract.DifficultyManager;
import model.Difficulty;
import org.springframework.stereotype.Component;

@Component
public class DifficultyManagerImpl extends ManagerImpl implements DifficultyManager {

    @Override
    public Difficulty addDifficultys(Difficulty difficulty) {
        return getDaoFactory().getDifficultyRepository().save(difficulty); }

    @Override
    public void saveDifficulty(Difficulty difficulty) {
        getDaoFactory().getDifficultyRepository().save(difficulty);
    }

    @Override
    public void deleteDifficulty(Long id) {
        getDaoFactory().getDifficultyRepository().deleteById(id);
    }
}
