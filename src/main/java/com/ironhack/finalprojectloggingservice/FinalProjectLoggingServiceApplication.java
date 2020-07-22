package com.ironhack.finalprojectloggingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FinalProjectLoggingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectLoggingServiceApplication.class, args);
	}

}
