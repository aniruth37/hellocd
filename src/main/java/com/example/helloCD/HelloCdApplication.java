package com.example.helloCD;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@SpringBootApplication
public class HelloCdApplication {

	@RequestMapping("/")
	String home() {
		return "Hello CI CD!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloCdApplication.class, args);
	}

}
