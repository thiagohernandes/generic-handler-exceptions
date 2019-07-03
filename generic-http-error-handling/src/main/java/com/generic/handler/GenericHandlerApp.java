package com.generic.handler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.generic.*"})
public class GenericHandlerApp {

	public static void main(String[] args) {
		SpringApplication.run(GenericHandlerApp.class, args);
	}
	

}
