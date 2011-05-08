package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjectspeciality", schema = "institute")
public class SubjectSpeciality implements Serializable {
	private int id;
	private int speciality;
	private int subject;

	public SubjectSpeciality(int speciality, int subject) {
		super();
		this.speciality = speciality;
		this.subject = subject;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Speciality", nullable = false, unique = false)
	public int getSpeciality() {
		return speciality;
	}

	public void setSpeciality(int speciality) {
		this.speciality = speciality;
	}

	@Column(name = "Subject", nullable = false, unique = false)
	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "SubjectSpeciality [id=" + id + ", speciality=" + speciality
				+ ", subject=" + subject + "]";
	}
}
