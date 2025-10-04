package com.petLife.demo.petstore.JpaRepository;

import java.util.List;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petLife.demo.petstore.Models.PetDetailsModel;
import com.petLife.demo.petstore.Models.PetInfoModel;

@Repository
public interface PetInfoRepo extends JpaRepository<PetInfoModel,UUID>{

	List <PetInfoModel> findBypetName(String petName);
	

}
