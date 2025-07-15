package com.cognizant.springlearn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@RestController
public class AuthenticationController {
    @GetMapping("/authenticate")
    public Map<String,String>authenticate(@RequestHeader("Authorization")String authHeader){
        String user=extractUsername(authHeader);
        String token=generateJwt(user);
        Map<String,String>response=new HashMap<>();
        response.put("token",token);
        return response;
    }
    private String extractUsername(String authHeader) {
        String base64Credentials=authHeader.substring("Basic ".length());
        byte[]decoded = Base64.getDecoder().decode(base64Credentials);
        String credentials =new String (decoded);
        return credentials.split(":")[0];
    }
    private String generateJwt(String user){
      return Jwts.builder()
              .setSubject(user)
              .setIssuedAt(new Date())
              .setExpiration(new Date(System.currentTimeMillis()+1200000))
              .signWith(SignatureAlgorithm.HS256,"secretkey")
              .compact();
    }
    }
