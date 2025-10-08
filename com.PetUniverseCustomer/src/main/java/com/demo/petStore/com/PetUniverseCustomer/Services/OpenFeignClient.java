package com.demo.petStore.com.PetUniverseCustomer.Services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "demo.petstore", url = "http://localhost:8080")
public interface OpenFeignClient {

    @PostMapping(value = "/petDetails/loginMessage", consumes = "application/json")
    String sendLoginMessage(@RequestBody PetUniverseCustomer.Model.LoginDto logindto);
    
}