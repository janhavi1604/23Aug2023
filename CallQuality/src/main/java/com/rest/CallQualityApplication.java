package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.model")
public class CallQualityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallQualityApplication.class, args);
	}

}
