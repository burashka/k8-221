package project.dao.institute;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Speciality;

public class SpecialityDAOImpl extends HibernateDaoSupport implements
		SpecialityDAO {

	@Override
	public Speciality createSpeciality(String name, String number, int semester) {
		Speciality spec = new Speciality(name, number, semester);
		return (Speciality) getHibernateTemplate().save(spec);
	}

	@Override
	public Speciality createSpeciality(Speciality speciality) {
		return (Speciality) getHibernateTemplate().save(speciality);
	}

	@Override
	public void removeSpeciality(Speciality speciality) {
		getHibernateTemplate().delete(speciality);
	}

	@Override
	public void updateSpeciality(Speciality speciality) {
		getHibernateTemplate().saveOrUpdate(speciality);
	}

	@Override
	public Speciality findSpeciality(String name, String number) {
		// TODO Auto-generated method stub
		return null;
	}

}
