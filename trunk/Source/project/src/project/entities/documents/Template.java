package project.entities.documents;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "template", schema = "documents")
public class Template implements Serializable {
	private int id;
	private Timestamp acceptanceDate;
	private String name;
	private String number;
	private int type;
	private String urlToXML;

	public Template(Timestamp acceptanceDate, String name, String number,
			int type, String urlToXML) {
		super();
		this.acceptanceDate = acceptanceDate;
		this.name = name;
		this.number = number;
		this.type = type;
		this.urlToXML = urlToXML;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "AcceptanceDate", nullable = false, unique = false)
	public Timestamp getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(Timestamp acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	@Column(name = "Name", nullable = false, unique = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Number", nullable = false, unique = false)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "Type", nullable = false, unique = false)
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "URLtoXML", nullable = false, unique = false)
	public String getUrlToXML() {
		return urlToXML;
	}

	public void setUrlToXML(String urlToXML) {
		this.urlToXML = urlToXML;
	}

	@Override
	public String toString() {
		return "Template [id=" + id + ", acceptanceDate=" + acceptanceDate
				+ ", name=" + name + ", number=" + number + ", type=" + type
				+ ", urlToXML=" + urlToXML + "]";
	}
}
