package project.entities.institute;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"group\"", schema = "institute")
public class Group implements Serializable {
	private int id;
	private int chair;
	private int course;
	private Date creationDate;
	private Date disbandmentDate;
	private int faculty;
	private String number;
	private int plan;
	private int speciality;

	public Group(int chair, int course, Date creationDate,
			Date disbandmentDate, int faculty, String number, int plan,
			int speciality) {
		super();
		this.chair = chair;
		this.course = course;
		this.creationDate = creationDate;
		this.disbandmentDate = disbandmentDate;
		this.faculty = faculty;
		this.number = number;
		this.plan = plan;
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

	@Column(name = "Course", nullable = false, unique = false)
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Column(name = "CreationDate", nullable = false, unique = false)
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "DisbandmentDate", nullable = false, unique = false)
	public Date getDisbandmentDate() {
		return disbandmentDate;
	}

	public void setDisbandmentDate(Date disbandmentDate) {
		this.disbandmentDate = disbandmentDate;
	}

	@Column(name = "Faculty", nullable = false, unique = false)
	public int getFaculty() {
		return faculty;
	}

	public void setFaculty(int faculty) {
		this.faculty = faculty;
	}

	@Column(name = "Number", nullable = false, unique = false)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "Plan", nullable = false, unique = false)
	public int getPlan() {
		return plan;
	}

	public void setPlan(int plan) {
		this.plan = plan;
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
		return "Group [id=" + id + ", chair=" + chair + ", course=" + course
				+ ", creationDate=" + creationDate + ", disbandmentDate="
				+ disbandmentDate + ", faculty=" + faculty + ", number="
				+ number + ", plan=" + plan + ", speciality=" + speciality
				+ "]";
	}
}
