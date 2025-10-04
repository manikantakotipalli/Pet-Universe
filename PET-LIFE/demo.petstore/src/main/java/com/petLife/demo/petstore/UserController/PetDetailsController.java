package com.petLife.demo.petstore.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.petLife.demo.petstore.Models.PetDetailsModel;
import com.petLife.demo.petstore.StoringDataService.PetDetailsDataService;

@RestController
public class PetDetailsController {
	
	@Autowired
	PetDetailsDataService petService;
	
	@PostMapping("/Add Pet")
	public String petdatasave(@RequestBody PetDetailsModel petModel) {
		
	return	petService.saveDetails(petModel);
		
	}

}
