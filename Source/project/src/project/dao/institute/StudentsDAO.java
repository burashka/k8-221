package project.dao.institute;

import project.entities.institute.Students;

public interface StudentsDAO {
	public Students createStudents();

	public Students createStudents(Students students);

	public void removeStudents(Students students);

	public void updateStudents(Students students);

	public Students findStudents();
}
