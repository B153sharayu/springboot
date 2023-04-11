package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		System.out.println("this is spring boot");
		SpringApplication.run(SpringBoot1Application.class, args);
	}

}
