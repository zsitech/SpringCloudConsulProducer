package com.consul.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudConsulProducerApplication {

	@RequestMapping(value="/say_hello_producer")
	public String SayHello() {
		return "Hello, Spring Cloud Consul.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulProducerApplication.class, args);
	}

}
