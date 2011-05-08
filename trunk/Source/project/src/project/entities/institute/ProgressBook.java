package project.entities.institute;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "progressbook", schema = "institute")
public class ProgressBook implements Serializable {
	private int id;
	private Date date;
	private int group;
	private int teacher;

	public ProgressBook(Date date, int group, int teacher) {
		super();
		this.date = date;
		this.group = group;
		this.teacher = teacher;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Date", nullable = false, unique = false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "\"Group\"", nullable = false, unique = false)
	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
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
		return "ProgressBook [id=" + id + ", date=" + date + ", group=" + group
				+ ", teacher=" + teacher + "]";
	}
}
