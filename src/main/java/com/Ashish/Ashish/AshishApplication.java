package com.Ashish.Ashish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class AshishApplication {

	public static void main(String[] args) {
		SpringApplication.run(AshishApplication.class, args);
	}
    @GetMapping("/")
	public String hello(){
		return String.format("Hello %s!","World");
	}
}
