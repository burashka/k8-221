package project.entities.institute;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person", schema = "institute")
public class Person implements Serializable {
	private int id;
	private Date DOB;
	private String deliveryDate;
	private String INN;
	private String name;
	private String number;
	private String permit;

	public Person(Date dOB, String deliveryDate, String iNN, String name,
			String number, String permit) {
		super();
		this.DOB = dOB;
		this.deliveryDate = deliveryDate;
		this.INN = iNN;
		this.name = name;
		this.number = number;
		this.permit = permit;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "DOB", nullable = false, unique = false)
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	@Column(name = "DeliveryDate", nullable = false, unique = false)
	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Column(name = "INN", nullable = false, unique = false)
	public String getINN() {
		return INN;
	}

	public void setINN(String iNN) {
		INN = iNN;
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

	@Column(name = "Permit", nullable = false, unique = false)
	public String getPermit() {
		return permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", DOB=" + DOB + ", deliveryDate="
				+ deliveryDate + ", INN=" + INN + ", name=" + name
				+ ", number=" + number + ", permit=" + permit + "]";
	}
}
