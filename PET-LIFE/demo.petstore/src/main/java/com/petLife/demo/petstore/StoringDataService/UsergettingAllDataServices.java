package com.petLife.demo.petstore.StoringDataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.petLife.demo.petstore.JpaRepository.JpaRepo;
import com.petLife.demo.petstore.Models.RegistrationModel;

@Service
public class UsergettingAllDataServices {
	 @Autowired
	    private JpaRepo jpaLogin;

	    public ResponseEntity<?> findAllData() {
	        List<RegistrationModel> users = jpaLogin.findAll();

	        if (users.isEmpty()) {
	            return ResponseEntity
	                    .status(HttpStatus.NOT_FOUND)
	                    .body("❌ No users found in the database!");
	        } else {
	            return ResponseEntity.ok(users);
	        }
	    }
}
