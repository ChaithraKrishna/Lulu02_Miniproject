package com.minipro2.Lulu_API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LuluApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuluApiGatewayApplication.class, args);
	}

}
