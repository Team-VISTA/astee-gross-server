package com.vista.astee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AsteeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsteeApplication.class, args);
	}

}
