package project.dao.institute;

import project.entities.institute.Teacher;

public interface TeacherDAO {
	public Teacher createTeacher(int chair, String degree, int employee,
			int faculty, int speciality);

	public Teacher createTeacher(Teacher teacher);

	public void removeTeacher(Teacher teacher);

	public void updateTeacher(Teacher teacher);

	public Teacher findTeacher(int employee);
}
