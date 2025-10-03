package com.petLife.demo.petstore.StoringDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.petLife.demo.petstore.JpaRepository.JpaRepo;
import com.petLife.demo.petstore.Models.LoginDto;
@Service
public class UserLoginService {
	
    private final RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	public JpaRepo jpaLogin;

	
	public String checking(LoginDto logindto) {
		String username=logindto.getUserName();
		String password=logindto.getPassWord();
		if ("admin".equals(username) && "admin".equals(password)) {
            // ✅ Call PetDetailsService
            String url = "http://localhost:8082/petDetails/loginMessage";
            String message = "User Logged in: " + username;

            restTemplate.postForObject(url, message, String.class);

            return "Exists";
        } else {
            return "Doesn't Exist";
        }
	}

}
