package project.entities.documents;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document", schema = "documents")
public class Document implements Serializable {
	private int id;
	private Timestamp archiveDate;
	private Timestamp endDate;
	private String number;
	private Timestamp startDate;
	private int template;
	private String urlToScan;
	private String urlToXML;

	public Document(Timestamp archiveDate, Timestamp endDate, String number,
			Timestamp startDate, int template, String urlToScan, String urlToXML) {
		super();
		this.archiveDate = archiveDate;
		this.endDate = endDate;
		this.number = number;
		this.startDate = startDate;
		this.template = template;
		this.urlToScan = urlToScan;
		this.urlToXML = urlToXML;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ArchiveDate", nullable = false, unique = false)
	public Timestamp getArchiveDate() {
		return archiveDate;
	}

	public void setArchiveDate(Timestamp archiveDate) {
	}

	@Column(name = "EndDate", nullable = false, unique = false)
	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	@Column(name = "Number", nullable = false, unique = false)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "StartDate", nullable = false, unique = false)
	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	@Column(name = "Template", nullable = false, unique = false)
	public int getTemplate() {
		return template;
	}

	public void setTemplate(int template) {
		this.template = template;
	}

	@Column(name = "URLtoScan", nullable = false, unique = false)
	public String getUrlToScan() {
		return urlToScan;
	}

	public Document() {
		super();
	}

	public void setUrlToScan(String urlToScan) {
		this.urlToScan = urlToScan;
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
		return "Document [id=" + id + ", archiveDate=" + archiveDate
				+ ", endDate=" + endDate + ", number=" + number
				+ ", startDate=" + startDate + ", template=" + template
				+ ", urlToScan=" + urlToScan + ", urlToXML=" + urlToXML + "]";
	}

}
