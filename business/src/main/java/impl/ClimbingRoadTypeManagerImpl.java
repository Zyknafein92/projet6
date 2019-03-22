package impl;

import contract.ClimbingRoadTypeManager;
import model.ClimbingRoadType;
import org.springframework.stereotype.Component;

@Component
public class ClimbingRoadTypeManagerImpl extends ManagerImpl implements ClimbingRoadTypeManager {


    @Override
    public ClimbingRoadType addClimbingRoadType(ClimbingRoadType climbingRoadType) {
        return getDaoFactory().getClimbingRoadTypeRepository().save(climbingRoadType);
    }

    @Override
    public void saveClimbingRoadType(ClimbingRoadType climbingRoadType) {
        getDaoFactory().getClimbingRoadTypeRepository().save(climbingRoadType);

    }

    @Override
    public void deleteClimbingRoadType(Long Id) {
        getDaoFactory().getClimbingRoadTypeRepository().deleteById(Id);
    }
}

