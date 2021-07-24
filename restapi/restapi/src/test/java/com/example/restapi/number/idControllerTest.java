package com.example.restapi.number;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class idControllerTest {

    @Autowired
    private TestRestTemplate resTemplate;

    @MockBean
    private Random stubRandom;

    @Test
    void generateId() {
        when(stubRandom.nextInt(anyInt())).thenReturn(7);
        DataResponse result = resTemplate.getForObject("/id", DataResponse.class);
        assertEquals("XYZ7", result.getId());
    }
}