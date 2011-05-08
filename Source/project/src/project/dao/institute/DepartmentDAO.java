package project.dao.institute;

import project.entities.institute.Department;

public interface DepartmentDAO {
	public Department createDepartment(String name, int parent);

	public Department createDepartment(Department department);

	public void removeDepartment(Department department);

	public void updateDepartment(Department department);

	public Department findDepartment(String name);
}
