package project.dao.institute;

import project.entities.institute.Speciality;

public interface SpecialityDAO {
	public Speciality createSpeciality(String name, String number, int semester);

	public Speciality createSpeciality(Speciality speciality);

	public void removeSpeciality(Speciality speciality);

	public void updateSpeciality(Speciality speciality);

	public Speciality findSpeciality(String name, String number);
}
