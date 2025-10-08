package com.petLife.demo.petstore.Models;



import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PetDetails")
public class PetDetailsModel {
	  @Id
	    @GeneratedValue(generator = "UUID")
	    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	    @Column(name = "petId", updatable = false, nullable = false)
	    private UUID petId;
	
	@Column(name="petname")
	private String petName;
	@Column(name="petCategory")
	private String petCategory;
	@Column(name="petPrice")
	private double petPrice;
	@Column(name="petDescription")
	private String petDescription;
	@Column(name="petstatus")
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPetPrice(double petPrice) {
		this.petPrice = petPrice;
	}
	public UUID getPetId() {
		return petId;
	}
	public void setPetId(UUID petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetCategory() {
		return petCategory;
	}
	public void setPetCategory(String petCategory) {
		this.petCategory = petCategory;
	}
	public double  getPetPrice() {
		return petPrice;
	}

	public String getPetDescription() {
		return petDescription;
	}
	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}
	
}
