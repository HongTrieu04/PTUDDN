package com.example.testing_001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.testing_001") // Đổi thành package chính xác của bạn
public class Testing001Application {
	public static void main(String[] args) {
		SpringApplication.run(Testing001Application.class, args);
	}
}

