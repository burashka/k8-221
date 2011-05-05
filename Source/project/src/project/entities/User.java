package project.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "\"user\"", schema = "\"authorization\"")
//@SequenceGenerator(name = "users.USER_sequence", sequenceName = "users.USER_sequence_id_seq")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String password;

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public User() {
	}

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users.USER_sequence")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Login", nullable = false, unique = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name = "Password", nullable = false, unique = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
