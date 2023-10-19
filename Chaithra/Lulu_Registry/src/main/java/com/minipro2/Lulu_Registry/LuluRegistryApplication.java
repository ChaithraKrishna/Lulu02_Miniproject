package com.minipro2.Lulu_Registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LuluRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluRegistryApplication.class, args);
	}

}
