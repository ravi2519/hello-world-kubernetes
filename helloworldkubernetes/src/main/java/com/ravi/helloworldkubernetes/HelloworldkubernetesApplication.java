package com.ravi.helloworldkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HelloworldkubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldkubernetesApplication.class, args);
	}

}
