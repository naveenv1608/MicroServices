package com.naveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroServicesProject6ConfigurationServerNativeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProject6ConfigurationServerNativeConfigApplication.class, args);
	}

}
