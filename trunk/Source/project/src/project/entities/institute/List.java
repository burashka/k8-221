package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list", schema = "institute")
public class List implements Serializable {
	private int id;
	private int progressBook;
	private int student;
	private float value;

	public List(int progressBook, int student, float value) {
		super();
		this.progressBook = progressBook;
		this.student = student;
		this.value = value;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ProgressBook", nullable = false, unique = false)
	public int getProgressBook() {
		return progressBook;
	}

	public void setProgressBook(int progressBook) {
		this.progressBook = progressBook;
	}

	@Column(name = "Student", nullable = false, unique = false)
	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	@Column(name = "Value", nullable = false, unique = false)
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "List [id=" + id + ", progressBook=" + progressBook
				+ ", student=" + student + ", value=" + value + "]";
	}
}
