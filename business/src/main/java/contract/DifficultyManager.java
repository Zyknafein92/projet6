package contract;


import model.Difficulty;

public interface DifficultyManager {

    Difficulty addDifficultys(Difficulty difficulty);

    void saveDifficulty(Difficulty difficulty);

    void deleteDifficulty(Long id);

}
