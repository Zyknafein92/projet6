package impl;


import contract.DepartmentManagner;
import model.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentManagerImpl implements DepartmentManagner {

    @Override
    public Department addDepartments(Department department) {
        return null;
    }

    @Override
    public void saveDepartment(Department department) {

    }

    @Override
    public void deleteDepartment(Long id) {

    }
}
