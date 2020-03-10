package com.example.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
public class HelloWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWordApplication.class, args);
	}

}
