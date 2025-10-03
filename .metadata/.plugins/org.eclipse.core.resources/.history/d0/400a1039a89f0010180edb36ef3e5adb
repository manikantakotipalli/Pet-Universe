package com.petLife.demo.petstore.StoringDataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petLife.demo.petstore.JpaRepository.JpaRepo;
import com.petLife.demo.petstore.Models.RegistrationModel;

@Service
public class UserStoringDataService {
	    
	     @Autowired
	     public JpaRepo jpaRepo;
	  public String saveDataService(RegistrationModel registrationModel) {
	        boolean userNameExists = !jpaRepo.findByUserName(registrationModel.getUserName()).isEmpty(); 
		    boolean mobileExists = !jpaRepo.findByMobileNumber(registrationModel.getMobileNumber()).isEmpty();
	        boolean emailExists = !jpaRepo.findByEmail(registrationModel.getEmail()).isEmpty();

	        if (mobileExists && emailExists && userNameExists ) {
	            return "the given username, Mobile number and Email already exist!";
	        } else if (mobileExists) {
	            return "Mobile number already exists!";
	        } else if (emailExists) {
	            return "Email already exists!";
	        }
	        else if(userNameExists) {
	        	return "userNameExists already Exists";
	        }

	        jpaRepo.save(registrationModel);
	        return "Successfully saved!";   
	  }
	
}
