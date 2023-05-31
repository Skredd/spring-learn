package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BuildingWebService {
    public static void main(String[] args) {
        SpringApplication.run(BuildingWebService.class, args);
    }
}