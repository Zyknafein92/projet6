package contract;


import model.ClimbingRoad;

public interface ClimbingRoadManager {

    ClimbingRoad addClimbingRoad(ClimbingRoad climbingRoad);

    void saveClimbingRoad(ClimbingRoad climbingRoad);

    void deleteClimbingRoad(Long id);
}
