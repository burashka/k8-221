package project.entities.documents;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dynamicparameters", schema = "documents")
public class DynamicParameters implements Serializable {
	private int id;
	private int pattern;
	private String sqlQuery;

	public DynamicParameters(int pattern, String sqlQuery) {
		super();
		this.pattern = pattern;
		this.sqlQuery = sqlQuery;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Pattern", nullable = false, unique = false)
	public int getPattern() {
		return pattern;
	}

	public void setPattern(int pattern) {
		this.pattern = pattern;
	}

	@Column(name = "SQLQuery", nullable = false, unique = false)
	public String getSqlQuery() {
		return sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	@Override
	public String toString() {
		return "DynamicParameters [id=" + id + ", pattern=" + pattern
				+ ", sqlQuery=" + sqlQuery + "]";
	}
}
