package project.entities.institute;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", schema = "institute")
public class Student implements Serializable {
	private int id;
	private Date acceptanceDate;
	private Date deductionDate;
	private int group;
	private String number;
	private int person;
	private String testBook;

	public Student(Date acceptanceDate, Date deductionDate, int group,
			String number, int person, String testBook) {
		super();
		this.acceptanceDate = acceptanceDate;
		this.deductionDate = deductionDate;
		this.group = group;
		this.number = number;
		this.person = person;
		this.testBook = testBook;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "AcceptanceDate", nullable = false, unique = false)
	public Date getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	@Column(name = "DeductionDate", nullable = false, unique = false)
	public Date getDeductionDate() {
		return deductionDate;
	}

	public void setDeductionDate(Date deductionDate) {
		this.deductionDate = deductionDate;
	}

	@Column(name = "\"Group\"", nullable = false, unique = false)
	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	@Column(name = "Number", nullable = false, unique = false)
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "Person", nullable = false, unique = false)
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	@Column(name = "TestBook", nullable = false, unique = false)
	public String getTestBook() {
		return testBook;
	}

	public void setTestBook(String testBook) {
		this.testBook = testBook;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", acceptanceDate=" + acceptanceDate
				+ ", deductionDate=" + deductionDate + ", group=" + group
				+ ", number=" + number + ", person=" + person + ", testBook="
				+ testBook + "]";
	}
}
