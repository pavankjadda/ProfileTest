package com.example.profiletest;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "elk.logging.rabbitmq")
@Data
public class ElkRabbitmqProperties
{
	String host;
	String username;
	String password;
}
