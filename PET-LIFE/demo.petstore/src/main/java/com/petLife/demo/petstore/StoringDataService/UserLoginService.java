package com.petLife.demo.petstore.StoringDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.petLife.demo.petstore.JpaRepository.JpaRepo;
import com.petLife.demo.petstore.Models.LoginDto;
import com.petLife.demo.petstore.Models.RegistrationModel;
@Service
public class UserLoginService {
	 @Autowired
	 private JpaRepo jpaLogin;

	    public String checking(LoginDto logindto) {
	        String username = logindto.getUserName();
	        String password = logindto.getPassWord();

	        // ✅ Check if user exists in the database
	        RegistrationModel user = jpaLogin.findByUserNameAndPassword(username, password);

	        if (user != null) {
	            return "✅ Login successful for user: " + username;
	        } else {
	            return "❌ Invalid username or password!";
	        }
	    }
	}

