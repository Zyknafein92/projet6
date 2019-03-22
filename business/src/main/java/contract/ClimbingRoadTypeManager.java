package contract;


import model.ClimbingRoadType;

public interface ClimbingRoadTypeManager {

     ClimbingRoadType addClimbingRoadType(ClimbingRoadType climbingRoadType);

     void saveClimbingRoadType(ClimbingRoadType climbingRoadType);

     void deleteClimbingRoadType(Long Id);
}
