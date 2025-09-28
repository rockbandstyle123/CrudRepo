package com.cjc.main.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class SbaRestPostmanCrudDbEightApplication {

	public static void main(String[] args) {
		System.out.println(" Spring Boot Application - Web Service - REST - Postman - Database ");
		SpringApplication.run(SbaRestPostmanCrudDbEightApplication.class, args);
	}

}
