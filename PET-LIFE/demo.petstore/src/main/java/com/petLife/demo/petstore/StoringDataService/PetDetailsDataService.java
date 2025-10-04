package com.petLife.demo.petstore.StoringDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petLife.demo.petstore.JpaRepository.PetDetailsRepo;
import com.petLife.demo.petstore.JpaRepository.PetInfoRepo;
import com.petLife.demo.petstore.Models.PetDetailsModel;
import com.petLife.demo.petstore.Models.PetInfoModel;

@Service
public class PetDetailsDataService {
	
	@Autowired
	PetDetailsRepo petDetailsRepo;
	
	
	public String  saveDetails(PetDetailsModel petModel) {
		boolean petName = !petDetailsRepo.findBypetName(petModel.getPetName()).isEmpty();
		 if(petName==true) {
	        
		return "the given PetName Already Exists";}
		 
		 else {
			 petDetailsRepo.save(petModel);
			 return "Successfully Add";
			 
			 
		 }
		
	}

}
