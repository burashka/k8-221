package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Subject;

public class SubjectDAOImpl extends HibernateDaoSupport implements SubjectDAO {

	@Override
	public Subject createSubject(String name, String report, float time,
			String type) {
		Subject subject = new Subject(name, report, time, type);
		return (Subject) getHibernateTemplate().save(subject);
	}

	@Override
	public Subject createSubject(Subject subject) {
		return (Subject) getHibernateTemplate().save(subject);
	}

	@Override
	public void removeSubject(Subject subject) {
		getHibernateTemplate().delete(subject);
	}

	@Override
	public void updateSubject(Subject subject) {
		getHibernateTemplate().saveOrUpdate(subject);
	}

	@Override
	public Subject findSubject(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
