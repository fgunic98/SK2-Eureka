package com.noris.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NorisEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorisEurekaApplication.class, args);
	}

}
