package impl;


import contract.ClimbingRoadManager;
import model.ClimbingRoad;
import org.springframework.stereotype.Component;

@Component
public class ClimbingRoadManagerImpl extends ManagerImpl implements ClimbingRoadManager {

    @Override
    public ClimbingRoad addClimbingRoad(ClimbingRoad climbingRoad) {
        return getDaoFactory().getClimbingRoadRepository().save(climbingRoad);
    }

    @Override
    public void saveClimbingRoad(ClimbingRoad climbingRoad) {
        getDaoFactory().getClimbingRoadRepository().save(climbingRoad);

    }
    @Override
    public void deleteClimbingRoad(Long id) {
        getDaoFactory().getClimbingRoadRepository().deleteById(id);
    }
}

