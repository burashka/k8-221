package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Department;

public class DepartmentDAOImpl extends HibernateDaoSupport implements
		DepartmentDAO {

	@Override
	public Department createDepartment(String name, int parent) {
		Department department = new Department(name, parent);
		return (Department) getHibernateTemplate().save(department);
	}

	@Override
	public Department createDepartment(Department department) {
		return (Department) getHibernateTemplate().save(department);
	}

	@Override
	public void removeDepartment(Department department) {
		getHibernateTemplate().delete(department);
	}

	@Override
	public void updateDepartment(Department department) {
		getHibernateTemplate().saveOrUpdate(department);
	}

	@Override
	public Department findDepartment(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
