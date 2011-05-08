package project.dao.institute;

import java.sql.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Employee;

public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO {

	@Override
	public Employee createDepartment(Date acceptanceDate, String card,
			Date deductionDate, String insurance, int person, String postal,
			String receipt) {
		Employee employee = new Employee(acceptanceDate, card, deductionDate,
				insurance, person, postal, receipt);
		return (Employee) getHibernateTemplate().save(employee);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return (Employee) getHibernateTemplate().save(employee);
	}

	@Override
	public void removeEmployee(Employee employee) {
		getHibernateTemplate().delete(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		getHibernateTemplate().saveOrUpdate(employee);
	}

	@Override
	public Employee findEmployee(int person) {
		// TODO Auto-generated method stub
		return null;
	}

}
