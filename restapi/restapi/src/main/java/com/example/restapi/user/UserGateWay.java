package com.example.restapi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class UserGateWay {

    @Autowired
    private RestTemplate restTemplate;

    public UserResponse getUserById(int id) {
        String url = "https://jsonplaceholder.typicode.com/users/1";
        UserResponse user
                = restTemplate.getForObject(url, UserResponse.class);
        return user;
    }

}
