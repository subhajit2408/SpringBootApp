package com.org;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EntityScan(basePackages ={"com.org.entity"})
public class SpringBootApp implements CommandLineRunner {
	
	 public static void main(String[] args) {
			ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
	 }

	public void run(String... args) throws Exception {
	
		
	}

}
