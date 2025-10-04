package com.petLife.demo.petstore.Models;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="PetInfo")
public class PetInfoModel {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "Id", updatable = false, nullable = false, columnDefinition = "BINARY(16)")
	private UUID petId;
	
    @Column(name="petName")
	private String petName;
  
	
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
	
	
	
}

