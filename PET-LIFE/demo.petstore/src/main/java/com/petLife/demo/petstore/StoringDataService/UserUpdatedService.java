package com.petLife.demo.petstore.StoringDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petLife.demo.petstore.JpaRepository.JpaRepo;
import com.petLife.demo.petstore.Models.RegistrationModel;

@Service
public class UserUpdatedService {
	   
    @Autowired
    public JpaRepo jpaRepo;
	
	 public String  userUpdated(String userName, RegistrationModel updatedUser) {
		 RegistrationModel  existingUser=jpaRepo.findByuserName(userName);
		 
		   if((  existingUser !=null)){
			   
			   existingUser.setFirstName(updatedUser.getFirstName());
			    existingUser.setLastName(updatedUser.getLastName());
			    existingUser.setUserName(updatedUser.getUserName());
			    existingUser.setPassword(updatedUser.getPassword());
			    existingUser.setMobileNumber(updatedUser.getMobileNumber());
			    existingUser.setEmail(updatedUser.getEmail());
			   
			    jpaRepo.save(existingUser);
			   return "Successfully updated";
		   }
		   else 
		   {
			   return "the given User dosn't Exsits";
		   }
		 
		 
	 }
	

}
