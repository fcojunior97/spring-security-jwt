package com.security.springsecutiryjwt.api.controller;

import com.security.springsecutiryjwt.api.security.service.AutheticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AutheticationService autheticationService;


    @PostMapping("authenticate")
    public String autheticate(Authentication authentication) {
        return autheticationService.authenticate(authentication);
    }

}
