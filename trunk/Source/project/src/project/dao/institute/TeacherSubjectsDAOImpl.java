package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.TeacherSubjects;

public class TeacherSubjectsDAOImpl extends HibernateDaoSupport implements
		TeacherSubjectsDAO {

	@Override
	public TeacherSubjects createTeacherSubjects(int subject, int teacher) {
		TeacherSubjects teachSubj = new TeacherSubjects(subject, teacher);
		return (TeacherSubjects) getHibernateTemplate().save(teachSubj);
	}

	@Override
	public TeacherSubjects createTeacherSubjects(TeacherSubjects teacherSubjects) {
		return (TeacherSubjects) getHibernateTemplate().save(teacherSubjects);
	}

	@Override
	public void removeTeacherSubjects(TeacherSubjects teacherSubjects) {
		getHibernateTemplate().delete(teacherSubjects);
	}

	@Override
	public void updateTeacherSubjects(TeacherSubjects teacherSubjects) {
		getHibernateTemplate().saveOrUpdate(teacherSubjects);
	}

	@Override
	public TeacherSubjects findTeacherSubjects(int subject, int teacher) {
		// TODO Auto-generated method stub
		return null;
	}

}
