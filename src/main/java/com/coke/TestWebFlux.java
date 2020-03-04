package com.coke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = { "com.coke" })
public class TestWebFlux {
	public static void main(String[] args) {
		SpringApplication.run(TestWebFlux.class, args);
	}
}
