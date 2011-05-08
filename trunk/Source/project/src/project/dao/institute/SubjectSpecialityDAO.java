package project.dao.institute;

import project.entities.institute.SubjectSpeciality;

public interface SubjectSpecialityDAO {
	public SubjectSpeciality createSubjectSpeciality(int speciality, int subject);

	public SubjectSpeciality createSubjectSpeciality(
			SubjectSpeciality subjectSpeciality);

	public void removeSubjectSpeciality(SubjectSpeciality subjectSpeciality);

	public void updateSubjectSpeciality(SubjectSpeciality subjectSpeciality);

	public SubjectSpeciality findSubjectSpeciality(int speciality, int subject);

}
