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

     void setAdminRepository(AdminRepository adminRepository);
     void setAreaRepository(AreaRepository areaRepository);
     void setClimbingRoad(ClimbingRoadRepository climbingRoadRepository);
     void setClimbingRoadTypeRepository(ClimbingRoadTypeRepository climbingRoadTypeRepository);
     void setDepartmentRepository(DepartmentRepository departmentRepository);
     void setDifficultyRepository(DifficultyRepository difficultyRepository);
     void setSpotRepository(SpotRepository spotRepository);
     void setTopoRepository(TopoRepository topoRepository);
     void setUserRepository(UserRepository userRepository);
}
