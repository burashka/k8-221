package project.dao.institute;

import java.sql.Date;

import project.entities.institute.Employee;

public interface EmployeeDAO {
	public Employee createDepartment(Date acceptanceDate, String card,
			Date deductionDate, String insurance, int person, String postal,
			String receipt);

	public Employee createEmployee(Employee employee);

	public void removeEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public Employee findEmployee(int person);
}
