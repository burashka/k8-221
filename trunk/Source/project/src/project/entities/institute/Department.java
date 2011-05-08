package project.entities.institute;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department", schema = "institute")
public class Department implements Serializable {
	private int id;
	private String name;
	private int parent;

	public Department(String name, int parent) {
		super();
		this.name = name;
		this.parent = parent;
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

	@Column(name = "Parent", nullable = false, unique = false)
	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", parent=" + parent
				+ "]";
	}
}
