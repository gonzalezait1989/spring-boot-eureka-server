package com.aitorgonzalez.microservices_eureka_image_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaImageClient {

	public static void main(String[] args) {
		SpringApplication.run(EurekaImageClient.class, args);
	}
}
