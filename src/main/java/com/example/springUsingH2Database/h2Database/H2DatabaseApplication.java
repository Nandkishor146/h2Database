package com.example.springUsingH2Database.h2Database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2DatabaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(H2DatabaseApplication.class, args);
		System.out.println("Done");
	}

}
