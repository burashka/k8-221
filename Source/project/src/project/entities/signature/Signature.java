package project.entities.signature;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signature", schema = "signature")
public class Signature implements Serializable {
	private int id;
	private String hash;
	private String key;
	private int person;

	public Signature() {

	}

	public Signature(String hash, String key, int person) {
		this.hash = hash;
		this.key = key;
		this.person = person;
	}

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Hash", nullable = false, unique = false)
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Column(name = "Key", nullable = false, unique = false)
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "Person", nullable = false, unique = false)
	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	public String toString() {
		return "Signature [hash=" + hash + ", key=" + key + ", person="
				+ person + "]";
	}

}
