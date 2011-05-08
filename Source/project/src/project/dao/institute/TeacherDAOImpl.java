package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Teacher;

public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDAO {

	@Override
	public Teacher createTeacher(int chair, String degree, int employee,
			int faculty, int speciality) {
		Teacher teacher = new Teacher(chair, degree, employee, faculty,
				speciality);
		return (Teacher) getHibernateTemplate().save(teacher);
	}

	@Override
	public Teacher createTeacher(Teacher teacher) {
		return (Teacher) getHibernateTemplate().save(teacher);
	}

	@Override
	public void removeTeacher(Teacher teacher) {
		getHibernateTemplate().delete(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		getHibernateTemplate().saveOrUpdate(teacher);
	}

	@Override
	public Teacher findTeacher(int employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
