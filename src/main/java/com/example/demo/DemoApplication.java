package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


	private final String applicationName;

	public DemoApplication(String applicationName) {
		this.applicationName = applicationName;
	}

	@GetMapping("/hello")
	public String initialMessage(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
