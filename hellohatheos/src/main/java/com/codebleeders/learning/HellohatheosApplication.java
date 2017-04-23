package com.codebleeders.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity
public class HellohatheosApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohatheosApplication.class, args);
	}
}
