package com.example.SecurityDemoDB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/helloUser")
	public String helloUser()
	{
		return "welcome User";
		
	}
	@GetMapping("/helloAdmin")
	public String helloAdmin()
	{
		return "welcome Admin";
		
	}
	
	
	
	
	
}
