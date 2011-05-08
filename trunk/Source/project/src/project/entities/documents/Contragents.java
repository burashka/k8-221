package project.entities.documents;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contragents", schema = "documents")
public class Contragents implements Serializable {
	private int id;
	private Timestamp dateOfSigning;
	private int document;
	private Timestamp endDateOfSigning;
	private int person;

	public Contragents(Timestamp dateOfSigning, int document,
			Timestamp endDateOfSigning, int person) {
		super();
		this.dateOfSigning = dateOfSigning;
		this.document = document;
		this.endDateOfSigning = endDateOfSigning;
		this.person = person;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "DateOfSigning", nullable = false, unique = false)
	public Timestamp getDateOfSigning() {
		return dateOfSigning;
	}

	public void setDateOfSigning(Timestamp dateOfSigning) {
		this.dateOfSigning = dateOfSigning;
	}

	@Column(name = "Document", nullable = false, unique = false)
	public int getDocument() {
		return document;
	}

	public void setDocument(int document) {
		this.document = document;
	}

	@Column(name = "EndDateOfSigning", nullable = false, unique = false)
	public Timestamp getEndDateOfSigning() {
		return endDateOfSigning;
	}

	public void setEndDateOfSigning(Timestamp endDateOfSigning) {
		this.endDateOfSigning = endDateOfSigning;
	}

	@Column(name = "Person", nullable = false, unique = false)
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Contragents [id=" + id + ", dateOfSigning=" + dateOfSigning
				+ ", document=" + document + ", ensDateOfSigning="
				+ endDateOfSigning + ", person=" + person + "]";
	}
}
