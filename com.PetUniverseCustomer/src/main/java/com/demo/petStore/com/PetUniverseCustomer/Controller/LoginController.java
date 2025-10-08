package com.demo.petStore.com.PetUniverseCustomer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.petStore.com.PetUniverseCustomer.Services.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginservice;
	
	  @PostMapping("/petDetails/loginMessage")
	    public String receiveLoginMessage(@RequestBody PetUniverseCustomer.Model.LoginDto logindto) {
		  
	       // System.out.println("📩 Message received in PetDetailsService: " + message);
	        return   loginservice.checking(logindto);
	    }
}
