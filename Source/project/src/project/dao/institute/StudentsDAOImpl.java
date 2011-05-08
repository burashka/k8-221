package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Students;

public class StudentsDAOImpl extends HibernateDaoSupport implements StudentsDAO {

	@Override
	public Students createStudents() {
		Students students = new Students();
		return (Students) getHibernateTemplate().save(students);
	}

	@Override
	public Students createStudents(Students students) {
		return (Students) getHibernateTemplate().save(students);
	}

	@Override
	public void removeStudents(Students students) {
		getHibernateTemplate().delete(students);
	}

	@Override
	public void updateStudents(Students students) {
		getHibernateTemplate().saveOrUpdate(students);
	}

	@Override
	public Students findStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
