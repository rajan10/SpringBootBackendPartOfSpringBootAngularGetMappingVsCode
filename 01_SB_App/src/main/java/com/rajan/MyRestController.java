package com.rajan;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MyRestController {
	@GetMapping("/welcome")
	public String geWelcomeMsg() {
		return "Welcome to FSD: integration of Angular with Spring Boot";
	}
	
	@GetMapping("/wish")
	public String geWishMsg() {
		return "All the best for the new year";
	}
}