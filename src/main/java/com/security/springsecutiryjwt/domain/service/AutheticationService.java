package com.security.springsecutiryjwt.domain.service;

import org.springframework.stereotype.Service;

@Service
public class AutheticationService {

    public String authenticate () {
        return "token";
    }


}
