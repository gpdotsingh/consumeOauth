package com.client.consumeOauth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    OAuth2RestTemplate oAuth2RestTemplate;

    @RequestMapping(value = "/api/users",method = RequestMethod.GET)
    public String getProfile()
    {
     return   oAuth2RestTemplate.getForEntity("http://localhost:8080/api/users",String.class).toString();
    }
}
