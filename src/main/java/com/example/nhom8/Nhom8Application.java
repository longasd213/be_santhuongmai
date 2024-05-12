package com.example.nhom8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude =  SecurityAutoConfiguration.class)
public class Nhom8Application {

    public static void main(String[] args) {
        SpringApplication.run(Nhom8Application.class, args);
    }


}
