package com.example.profiletest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController
{
	private final ElkRabbitmqProperties elkRabbitmqProperties;

	public ConfigController(ElkRabbitmqProperties elkRabbitmqProperties)
	{
		this.elkRabbitmqProperties = elkRabbitmqProperties;
	}

	@GetMapping("/")
	public String getProperties()
	{
		System.out.println("username:"+ elkRabbitmqProperties.getUsername());
		System.out.println("password:"+ elkRabbitmqProperties.getPassword());
		return "username:"+ elkRabbitmqProperties.getUsername()+" and password:"+ elkRabbitmqProperties.getPassword();
	}
}
