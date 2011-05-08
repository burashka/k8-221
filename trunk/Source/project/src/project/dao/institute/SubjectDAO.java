package project.dao.institute;

import project.entities.institute.Subject;

public interface SubjectDAO {
	public Subject createSubject(String name, String report, float time,
			String type);

	public Subject createSubject(Subject subject);

	public void removeSubject(Subject subject);

	public void updateSubject(Subject subject);

	public Subject findSubject(String name);
}
