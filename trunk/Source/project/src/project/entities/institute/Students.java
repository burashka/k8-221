package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students", schema = "institute")
public class Students implements Serializable {
	private int id;

	public Students() {
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + "]";
	}
}
