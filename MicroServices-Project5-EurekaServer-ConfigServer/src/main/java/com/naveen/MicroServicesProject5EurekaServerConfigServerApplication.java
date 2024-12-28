package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesProject5EurekaServerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProject5EurekaServerConfigServerApplication.class, args);
	}

}
