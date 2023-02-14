package com.example.demok8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController()
public class DemoK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoK8sApplication.class, args);
    }

    @GetMapping("/v1")
    public String someMethod() {
        Random random = new Random();
        return random.nextBoolean() ? "Its your lucky day." : "Sorry, try again :( .";
    }

}
