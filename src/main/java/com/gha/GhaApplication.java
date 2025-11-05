package com.gha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GhaApplication {

	public static void main(String[] args) {
		System.out.println("Hey I am hotfix in main branch added new feature to main");
		SpringApplication.run(GhaApplication.class, args);
	}

}
