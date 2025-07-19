package com.learn.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UnivrsityCourseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnivrsityCourseManagementApplication.class, args);
	}

}
