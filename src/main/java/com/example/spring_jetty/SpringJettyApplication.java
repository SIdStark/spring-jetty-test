package com.example.spring_jetty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringJettyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJettyApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello from Jetty";
	}

}
