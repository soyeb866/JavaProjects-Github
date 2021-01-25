package soyeb.ahmed.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity(name="family")
@Table(name="family")
public class FamilyEntity {
	
	@Id
	@Column(name="id_family_union")
	private int familyId;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	public FamilyEntity() {
	}

	public FamilyEntity(int familyId, String first_name, String last_name, String email) {
		this.familyId = familyId;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "FamilyEntity [familyId=" + familyId + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + "]";
	}
}
