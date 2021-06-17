package com.example.profiletest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController
{
	private final ConfigTest configTest;

	public ConfigController(ConfigTest configTest)
	{
		this.configTest = configTest;
	}

	@GetMapping("/")
	public String getProperties()
	{
		System.out.println("username:"+configTest.getUsername());
		System.out.println("password:"+configTest.getPassword());
		return "username:"+configTest.getUsername()+" and password:"+configTest.getPassword();
	}
}
