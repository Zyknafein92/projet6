package impl;




import contract.DepartmentManager;
import model.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentManagerImpl extends ManagerImpl implements DepartmentManager {

    @Override
    public Department addDepartments(Department department) { return getDaoFactory().getDepartmentRepository().save(department);    }

    @Override
    public void saveDepartment(Department department) {
      getDaoFactory().getDepartmentRepository().save(department);
    }

    @Override
    public void deleteDepartment(Long id) {getDaoFactory().getDepartmentRepository().deleteById(id);
    }

}
