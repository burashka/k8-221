package project.entities.documents;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "templatetypes", schema = "documents")
public class TemplateTypes implements Serializable {
	private int id;
	private String name;

	public TemplateTypes(String name) {
		super();
		this.name = name;
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

	@Override
	public String toString() {
		return "TemplateTypes [id=" + id + ", name=" + name + "]";
	}
}
