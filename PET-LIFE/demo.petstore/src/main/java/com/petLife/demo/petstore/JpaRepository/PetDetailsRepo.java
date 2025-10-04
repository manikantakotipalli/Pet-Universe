package com.petLife.demo.petstore.JpaRepository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.petLife.demo.petstore.Models.PetDetailsModel;
import com.petLife.demo.petstore.Models.RegistrationModel;

@Repository
public interface PetDetailsRepo extends  JpaRepository<PetDetailsModel,UUID>{
	
	List<PetDetailsModel> findBypetName(String petName);
	

}
