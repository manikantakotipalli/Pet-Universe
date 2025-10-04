package com.petLife.demo.petstore.StoringDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petLife.demo.petstore.JpaRepository.PetDetailsRepo;
import com.petLife.demo.petstore.JpaRepository.PetInfoRepo;
import com.petLife.demo.petstore.Models.PetInfoModel;

@Service
public class PetInfoService {
	   @Autowired
	   PetInfoRepo petinfoRepo;
	public String  petinfo(PetInfoModel petinfoModel) {
		
		boolean petName = !petinfoRepo.findBypetName(petinfoModel.getPetName()).isEmpty();
		
		if(petName==true) {
			return "Given Pet name alredy Exists";
		}
		else {
			petinfoRepo.save(petinfoModel);
			return "";
		}
		
	}

}
