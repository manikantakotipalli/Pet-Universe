package com.petLife.demo.petstore.StoringDataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petLife.demo.petstore.JpaRepository.JpaRepo;
import com.petLife.demo.petstore.Models.RegistrationModel;

@Service
public class UserDeleteService {

    @Autowired
    private JpaRepo jpaDelete;

    public String deletingExists(String username) {
        RegistrationModel rs = jpaDelete.findByuserName(username);
        if (rs == null) {
            return "❌ The given UserName '" + username + "' doesn't exist!";
        } else {
            jpaDelete.delete(rs); // delete the entity, not the string
            return "✅ User '" + username + "' deleted successfully!";
        }
    }
}