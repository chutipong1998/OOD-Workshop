package com.example.restapi;

import org.springframework.stereotype.Component;

@Component
public class GenerateIdService {

    public int counter;

    public String getId() {
        return "XYZ7";
    }
}
