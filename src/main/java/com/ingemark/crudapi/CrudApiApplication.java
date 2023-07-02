package com.ingemark.crudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@EnableCaching
//@ComponentScan(basePackages = { "com.ingemark.crudapi" })
//@EnableJpaRepositories(basePackages = "com.ingemark.crudapi.repository")
//@EnableJpaAuditing
//@EnableTransactionManagement
//@EntityScan(basePackages = "com.ingemark.crudapi.entity")
public class CrudApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApiApplication.class, args);
	}

}
