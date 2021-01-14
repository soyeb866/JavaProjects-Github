package soyeb.ahmed.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="relation")
@Table(name="relation")
public class RelationshipEntity {
	@Id
	@Column(name="relation_id")
	private int relationId;
	
	@ManyToOne(targetEntity=FamilyEntity.class)
	@JoinColumn(name="id_family_union")
	FamilyEntity familyEntity;
	
	@Column(name="relationship")
	private String relation;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;

	public RelationshipEntity() {

	}

	public RelationshipEntity(int relationId, FamilyEntity familyEntity, String relation, String phone, String address) {
		this.relationId = relationId;
		this.relation = relation;
		this.phone = phone;
		this.address = address;
		this.familyEntity = familyEntity;
	}

	public int getRelationId() {
		return relationId;
	}

	public void setRelationId(int relationId) {
		this.relationId = relationId;
	}

	

	public FamilyEntity getFamilyEntity() {
		return familyEntity;
	}

	public void setFamilyEntity(FamilyEntity familyEntity) {
		this.familyEntity = familyEntity;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RelationshipEntity [relationId=" + relationId + ", familyEntity=" + familyEntity + ", relation=" + relation
				+ ", phone=" + phone + ", address=" + address + "]";
	}

}
