package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MIcroServicesProject3EurekaServerLBClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MIcroServicesProject3EurekaServerLBClientApplication.class, args);
	}

}
