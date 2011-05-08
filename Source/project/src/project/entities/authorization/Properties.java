package project.entities.authorization;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "properties", schema = "\"authorization\"")
// @SequenceGenerator(name = "users.USER_sequence", sequenceName =
// "users.USER_sequence_id_seq")
public class Properties implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int role;
	private int user;
	private boolean value;

	public Properties(int role, int user, boolean value) {
		this.role = role;
		this.user = user;
		this.value = value;
	}

	public Properties() {
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Role", nullable = false, unique = false)
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Column(name = "User", nullable = false, unique = false)
	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	@Column(name = "Value", nullable = false, unique = false)
	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Property [role=" + role + ", user=" + user + ", value=" + value
				+ "]";
	}

}
