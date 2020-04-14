package com.carWasher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.carWasher.properties.CarWasherProperties;

@SpringBootApplication
@EnableConfigurationProperties(value=CarWasherProperties.class)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
