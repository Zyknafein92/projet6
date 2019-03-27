package contract;

import model.Department;


public interface DepartmentManager {

    Department addDepartments(Department department);

    void saveDepartment(Department department);

    void deleteDepartment(Long id);
}
