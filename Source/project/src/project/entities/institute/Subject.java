package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subject", schema = "institute")
public class Subject implements Serializable {
	private int id;
	private String name;
	private String report;
	private float time;
	private String type;

	public Subject(String name, String report, float time, String type) {
		super();
		this.name = name;
		this.report = report;
		this.time = time;
		this.type = type;
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

	@Column(name = "Report", nullable = false, unique = false)
	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}

	@Column(name = "Time", nullable = false, unique = false)
	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	@Column(name = "Type", nullable = false, unique = false)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", report=" + report
				+ ", time=" + time + ", type=" + type + "]";
	}
}
