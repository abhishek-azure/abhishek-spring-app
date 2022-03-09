package com.abhishek.abhishekspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AbhishekSpringAppApplication {

    @GetMapping("/message")
    public String message() {
        return "Congrats !! your application deployed successfully in Azure. ";
    }

    public static void main(String[] args) {
        SpringApplication.run(AbhishekSpringAppApplication.class, args);
    }

}
