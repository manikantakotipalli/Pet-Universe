package com.demo.petStore.com.PetUniverseCustomer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class LoginService 
{
    private final RestTemplate restTemplate = new RestTemplate();
	
	//public JpaRepo jpaLogin; 	
	public String checking(PetUniverseCustomer.Model.LoginDto logindto) 
	{
		String username=logindto.getUserName();
		String password=logindto.getPassWord();
		
            // ✅ Call PetDetailsService
            String url = "http://localhost:8082/petDetails/loginMessage";
           // String message = "User Logged in: " + username;

           return restTemplate.postForObject(url, logindto, String.class);

    }
}
