package com.techietipps.robservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RobServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobServiceApplication.class, args);
	}

}
