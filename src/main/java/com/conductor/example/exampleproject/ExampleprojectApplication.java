package com.conductor.example.exampleproject;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleprojectApplication {

    public static void main(String... args) {

//		SpringApplication.run(ExampleprojectApplication.class, args);
        Micronaut.run(ExampleprojectApplication.class);
    }

}
