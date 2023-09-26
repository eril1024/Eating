package com.eating.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatingApplication.class, args);
		System.out.println("hiss");
	}

}
