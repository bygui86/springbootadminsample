package com.rabbitshop.springbootadminservereureka;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminServerEurekaApplication.class, args);
	}
}