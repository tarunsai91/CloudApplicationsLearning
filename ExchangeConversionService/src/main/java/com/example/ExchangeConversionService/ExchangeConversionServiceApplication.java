package com.example.ExchangeConversionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExchangeConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExchangeConversionServiceApplication.class, args);
	}

}
