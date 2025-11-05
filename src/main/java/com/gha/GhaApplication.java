package com.gha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GhaApplication {

	public static void main(String[] args) {
		System.out.println("Hey I am hotfix in main branch and added another feature in develop");
		SpringApplication.run(GhaApplication.class, args);
	}

}
