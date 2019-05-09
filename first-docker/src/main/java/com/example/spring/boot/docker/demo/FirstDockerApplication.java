package com.example.spring.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstDockerApplication {
	
	@GetMapping("/check")
	public String getMessage() {
		return "This is my first docker program";
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstDockerApplication.class, args);
	}

}
