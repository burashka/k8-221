package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.SubjectSpeciality;

public class SubjectSpecialityDAOImpl extends HibernateDaoSupport implements
		SubjectSpecialityDAO {

	@Override
	public project.entities.institute.SubjectSpeciality createSubjectSpeciality(
			int speciality, int subject) {
		SubjectSpeciality subjSpec = new SubjectSpeciality(speciality, subject);
		return (SubjectSpeciality) getHibernateTemplate().save(subjSpec);
	}

	@Override
	public project.entities.institute.SubjectSpeciality createSubjectSpeciality(
			project.entities.institute.SubjectSpeciality subjectSpeciality) {
		return (SubjectSpeciality) getHibernateTemplate().save(
				subjectSpeciality);
	}

	@Override
	public void removeSubjectSpeciality(
			project.entities.institute.SubjectSpeciality subjectSpeciality) {
		getHibernateTemplate().delete(subjectSpeciality);

	}

	@Override
	public void updateSubjectSpeciality(
			project.entities.institute.SubjectSpeciality subjectSpeciality) {
		getHibernateTemplate().saveOrUpdate(subjectSpeciality);
	}

	@Override
	public project.entities.institute.SubjectSpeciality findSubjectSpeciality(
			int speciality, int subject) {
		// TODO Auto-generated method stub
		return null;
	}

}
