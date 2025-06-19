package com.firstmicroservice.microservice_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class MicroserviceDemoApplication {


	@GetMapping("/weatherForecast")
	public String getDate(){
		return "Todas is a sunny day for Java Service";
	}
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoApplication.class, args);
	}

}
