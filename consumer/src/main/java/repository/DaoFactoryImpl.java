package repository;


import contract.DaoFactory;
import org.springframework.stereotype.Component;

@Component
public class DaoFactoryImpl implements DaoFactory {

    private AdminRepository adminrepository;
    private AreaRepository arearepository;
    private ClimbingRoadRepository climbingRoadRepository;
    private ClimbingRoadTypeRepository climbingRoadTypeRepository;
    private DepartmentRepository departmentRepository;
    private DifficultyRepository difficultyRepository;
    private SpotRepository spotRepository;
    private TopoRepository topoRepository;
    private UserRepository userRepository;


    @Override
    public AdminRepository getAdminRepository() {
        return adminrepository;
    }

    @Override
    public AreaRepository getAreaRepository() {
        return arearepository;
    }

    @Override
    public ClimbingRoadRepository getClimbingRoadRepository() {
        return climbingRoadRepository;
    }

    @Override
    public ClimbingRoadTypeRepository getClimbingRoadTypeRepository() {
        return climbingRoadTypeRepository;
    }

    @Override
    public DepartmentRepository getDepartmentRepository() {
        return departmentRepository;
    }

    @Override
    public DifficultyRepository getDifficultyRepository() {
        return difficultyRepository;
    }

    @Override
    public SpotRepository getSpotRepository() {
        return spotRepository;
    }

    @Override
    public TopoRepository getTopoRepository() {
        return topoRepository;
    }

    @Override
    public UserRepository getuserRepository() {
        return userRepository;
    }

    @Override
    public void setAdminRepository(AdminRepository adminRepository) {

    }

    @Override
    public void setAreaRepository(AreaRepository areaRepository) {

    }

    @Override
    public void setClimbingRoad(ClimbingRoadRepository climbingRoadRepository) {

    }

    @Override
    public void setClimbingRoadTypeRepository(ClimbingRoadTypeRepository climbingRoadTypeRepository) {

    }

    @Override
    public void setDepartmentRepository(DepartmentRepository departmentRepository) {

    }

    @Override
    public void setDifficultyRepository(DifficultyRepository difficultyRepository) {

    }

    @Override
    public void setSpotRepository(SpotRepository spotRepository) {

    }

    @Override
    public void setTopoRepository(TopoRepository topoRepository) {

    }

    @Override
    public void setUserRepository(UserRepository userRepository) {

    }
}
