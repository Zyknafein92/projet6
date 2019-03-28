package contract;


import repository.*;

public interface DaoFactory {

     AdminRepository getAdminRepository();
     AreaRepository getAreaRepository();
     ClimbingRoadRepository getClimbingRoadRepository();
     ClimbingRoadTypeRepository getClimbingRoadTypeRepository();
     DepartmentRepository getDepartmentRepository();
     DifficultyRepository getDifficultyRepository();
     SpotRepository getSpotRepository();
     TopoRepository getTopoRepository();
     UserRepository getuserRepository();

}
