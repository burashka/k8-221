package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachersubjects", schema = "institute")
public class TeacherSubjects implements Serializable {
	private int id;
	private int subject;
	private int teacher;

	public TeacherSubjects(int subject, int teacher) {
		super();
		this.subject = subject;
		this.teacher = teacher;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Subject", nullable = false, unique = false)
	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	@Column(name = "Teacher", nullable = false, unique = false)
	public int getTeacher() {
		return teacher;
	}

	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "TeacherSubjects [id=" + id + ", subject=" + subject
				+ ", teacher=" + teacher + "]";
	}
}
