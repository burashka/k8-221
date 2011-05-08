package project.dao.institute;

import project.entities.institute.TeacherSubjects;

public interface TeacherSubjectsDAO {
	public TeacherSubjects createTeacherSubjects(int subject, int teacher);

	public TeacherSubjects createTeacherSubjects(TeacherSubjects teacherSubjects);

	public void removeTeacherSubjects(TeacherSubjects teacherSubjects);

	public void updateTeacherSubjects(TeacherSubjects teacherSubjects);

	public TeacherSubjects findTeacherSubjects(int subject, int teacher);
}
