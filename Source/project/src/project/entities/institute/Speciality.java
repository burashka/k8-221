package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "speciality", schema = "institute")
public class Speciality implements Serializable {
	private int id;
	private String name;
	private String number;
	private int semester;

	public Speciality(String name, String number, int semester) {
		super();
		this.name = name;
		this.number = number;
		this.semester = semester;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, unique = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Number", nullable = false, unique = false)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "Semester", nullable = false, unique = false)
	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Speciality [id=" + id + ", name=" + name + ", number=" + number
				+ ", semester=" + semester + "]";
	}
}
