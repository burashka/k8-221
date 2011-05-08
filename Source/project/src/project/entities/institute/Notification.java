package project.entities.institute;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notification", schema = "institute")
public class Notification implements Serializable {
	private int id;
	private Timestamp end;
	private Timestamp period;
	private int person;
	private Timestamp start;
	private String text;

	public Notification(Timestamp end, Timestamp period, int person,
			Timestamp start, String text) {
		super();
		this.end = end;
		this.period = period;
		this.person = person;
		this.start = start;
		this.text = text;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "End", nullable = false, unique = false)
	public Timestamp getEnd() {
		return end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	@Column(name = "Period", nullable = false, unique = false)
	public Timestamp getPeriod() {
		return period;
	}

	public void setPeriod(Timestamp period) {
		this.period = period;
	}

	@Column(name = "Person", nullable = false, unique = false)
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	@Column(name = "Start", nullable = false, unique = false)
	public Timestamp getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	@Column(name = "Text", nullable = false, unique = false)
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Notification [id=" + id + ", end=" + end + ", period=" + period
				+ ", person=" + person + ", start=" + start + ", text=" + text
				+ "]";
	}

}
