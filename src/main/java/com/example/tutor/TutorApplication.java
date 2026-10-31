package com.example.tutor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class TutorApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(TutorApplication.class, args);
	}

	@GetMapping("/hello-world")
	public String hello_world(String name) {
		return name;
	}

}
