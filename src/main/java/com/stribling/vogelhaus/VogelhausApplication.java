package com.stribling.vogelhaus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VogelhausApplication {

	public static void main(String[] args) {
		SpringApplication.run(VogelhausApplication.class, args);
		System.out.println("Running...");
	}

}
