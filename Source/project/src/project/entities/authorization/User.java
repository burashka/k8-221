package project.entities.authorization;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"user\"", schema = "\"authorization\"")
// @SequenceGenerator(name = "users.USER_sequence", sequenceName =
// "users.USER_sequence_id_seq")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String password;
	private int person;

	public User(String name, String password, int person) {
		this.name = name;
		this.password = password;
		this.person = person;
	}

	public User() {
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Login", nullable = false, unique = false)
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

	@Column(name = "Person", nullable = false, unique = false)
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

}
