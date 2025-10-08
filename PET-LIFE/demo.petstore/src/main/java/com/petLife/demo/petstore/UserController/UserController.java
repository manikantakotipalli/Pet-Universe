package com.petLife.demo.petstore.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petLife.demo.petstore.Models.LoginDto;
import com.petLife.demo.petstore.Models.RegistrationModel;
import com.petLife.demo.petstore.StoringDataService.UserDataSearching;
import com.petLife.demo.petstore.StoringDataService.UserDeleteService;
import com.petLife.demo.petstore.StoringDataService.UserLoginService;
import com.petLife.demo.petstore.StoringDataService.UserStoringDataService;
import com.petLife.demo.petstore.StoringDataService.UserUpdatedService;
import com.petLife.demo.petstore.StoringDataService.UsergettingAllDataServices;

@RestController
@RequestMapping("/User")
public class UserController {
	    @Autowired
	   public UserStoringDataService storingDataService;
	    @Autowired
	   public UserLoginService loginService; 
	    @Autowired
	    public UserDataSearching datasearching;
	    @Autowired
	    public UsergettingAllDataServices  gettingdata;
	    @Autowired
	    public UserUpdatedService userUpdatedService;
	     @Autowired
	    public UserDeleteService userdeleteservice;
	    
	@PostMapping("/AddUser")
	public String  postingData(@RequestBody RegistrationModel registrationModel) 
	         {
		return storingDataService.saveDataService(registrationModel);
	              }
	@PostMapping("/petDetails/loginMessage")
	    public String  checkUser(@RequestBody LoginDto logindto ) {
		 
		   	return  loginService.checking(logindto);    
	       
	    }
	 @GetMapping("/findAll")
	    public ResponseEntity<?> findingall(){
			return gettingdata.findAllData();
	    }
	  @GetMapping("/{input}")
	  public ResponseEntity<?> gettingAllData(@PathVariable String input) {
	      return datasearching.searching(input);
	         }
	  @PutMapping("/{userName}")
	  public String  updateData(@PathVariable String userName, RegistrationModel registrationModel) {
		  
	  return userUpdatedService.userUpdated(userName,registrationModel);
	  }
	  @DeleteMapping("/{delete}")
      public String deleteInput(@PathVariable String delete) {
		  
	  return userdeleteservice.deletingExists(delete);
	   }
}
