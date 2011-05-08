package project.dao.institute;

import java.sql.Date;

import project.entities.institute.Person;

public interface PersonDAO {
	public Person createPerson(Date dOB, String deliveryDate, String iNN,
			String name, String number, String permit);

	public Person createPerson(Person person);

	public void removePerson(Person person);

	public void updatePerson(Person person);

	public Person findPerson(String number, String name);
}
