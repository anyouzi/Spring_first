package com.example.spring_first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFirstApplication {
    private String a;
    public static void main(String[] args) {
        SpringApplication.run(SpringFirstApplication.class, args);
    }

}
