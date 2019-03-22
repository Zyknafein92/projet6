package contract;

import model.Department;

public interface DepartmentManagner {

    Department addDepartments(Department department);

    void saveDepartment(Department department);

    void deleteDepartment(Long id);
}
