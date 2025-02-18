package com.example.StockAnalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class StockAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockAnalyzerApplication.class, args);
	}

}
