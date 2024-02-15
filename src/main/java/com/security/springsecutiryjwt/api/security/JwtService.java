package com.security.springsecutiryjwt.api.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Autowired
    private JwtEncoder jwtEncoder;

}
