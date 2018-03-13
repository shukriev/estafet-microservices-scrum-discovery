package com.estafet.microservices.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
public class DiscoveryClientApplication extends SpringBootServletInitializer {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping(name = "/project", method = RequestMethod.GET)
	public String healthCheck() {
		System.out.println(discoveryClient.getServices());
		System.out.println(discoveryClient.getClass());
		return "";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientApplication.class, args);
	}
}
