package com.example.demo;

import com.example.demo.repository.entity.Customer;
import com.example.demo.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


	private final String applicationName;

	private final CustomerServiceImpl customerService;

	@Value("${application.name}")
	private String applicationNameDev;

	public DemoApplication(String applicationName, CustomerServiceImpl customerService) {
		this.applicationName = applicationName;
		this.customerService = customerService;
	}

	@GetMapping("/hello")
	public String initialMessage(){
		Customer c = new Customer();
		c.setName("Lucas Maia");
		customerService.save(c);
		return applicationName + "Customer saved : " +c.getName();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
