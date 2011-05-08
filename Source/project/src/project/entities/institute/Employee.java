package project.entities.institute;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee", schema = "institute")
public class Employee implements Serializable {
	private int id;
	private Date acceptanceDate;
	private String card;
	private Date deductionDate;
	private String insurance;
	private int person;
	private String postal;
	private String receipt;

	public Employee(Date acceptanceDate, String card, Date deductionDate,
			String insurance, int person, String postal, String receipt) {
		super();
		this.acceptanceDate = acceptanceDate;
		this.card = card;
		this.deductionDate = deductionDate;
		this.insurance = insurance;
		this.person = person;
		this.postal = postal;
		this.receipt = receipt;
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

	@Column(name = "Card", nullable = false, unique = false)
	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@Column(name = "DeductionDate", nullable = false, unique = false)
	public Date getDeductionDate() {
		return deductionDate;
	}

	public void setDeductionDate(Date deductionDate) {
		this.deductionDate = deductionDate;
	}

	@Column(name = "Insurance", nullable = false, unique = false)
	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Column(name = "Person", nullable = false, unique = false)
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	@Column(name = "Postal", nullable = false, unique = false)
	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	@Column(name = "Receipt", nullable = false, unique = false)
	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", acceptanceDate=" + acceptanceDate
				+ ", card=" + card + ", deductionDate=" + deductionDate
				+ ", insurance=" + insurance + ", person=" + person
				+ ", postal=" + postal + ", receipt=" + receipt + "]";
	}
}
