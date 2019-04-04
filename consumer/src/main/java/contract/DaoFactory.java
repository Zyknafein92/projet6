package contract;


import org.springframework.context.annotation.ComponentScan;
import repository.*;

@ComponentScan
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
