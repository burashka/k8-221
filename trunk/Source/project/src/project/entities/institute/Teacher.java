package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher", schema = "institute")
public class Teacher implements Serializable {
	private int id;
	private int chair;
	private String degree;
	private int employee;
	private int faculty;
	private int speciality;

	public Teacher(int chair, String degree, int employee, int faculty,
			int speciality) {
		super();
		this.chair = chair;
		this.degree = degree;
		this.employee = employee;
		this.faculty = faculty;
		this.speciality = speciality;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Chair", nullable = false, unique = false)
	public int getChair() {
		return chair;
	}

	public void setChair(int chair) {
		this.chair = chair;
	}

	@Column(name = "Degree", nullable = false, unique = false)
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "Employee", nullable = false, unique = false)
	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	@Column(name = "Faculty", nullable = false, unique = false)
	public int getFaculty() {
		return faculty;
	}

	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}

	@Column(name = "Speciality", nullable = false, unique = false)
	public int getSpeciality() {
		return speciality;
	}

	public void setSpeciality(int speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", chair=" + chair + ", degree=" + degree
				+ ", employee=" + employee + ", faculty=" + faculty
				+ ", speciality=" + speciality + "]";
	}
}
