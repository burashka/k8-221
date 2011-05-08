package project.dao.institute;

import java.sql.Date;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import project.entities.institute.Person;

public class PersonDAOImpl extends HibernateDaoSupport implements PersonDAO {

	@Override
	public Person createPerson(Date dOB, String deliveryDate, String iNN,
			String name, String number, String permit) {
		Person person = new Person(dOB, deliveryDate, iNN, name, number, permit);
		return (Person) getHibernateTemplate().save(person);
	}

	@Override
	public Person createPerson(Person person) {
		return (Person) getHibernateTemplate().save(person);
	}

	@Override
	public void removePerson(Person person) {
		getHibernateTemplate().delete(person);
	}

	@Override
	public void updatePerson(Person person) {
		getHibernateTemplate().saveOrUpdate(person);
	}

	@Override
	public Person findPerson(String number, String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
