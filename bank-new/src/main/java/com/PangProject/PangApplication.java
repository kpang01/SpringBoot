package com.PangProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@SpringBootApplication(scanBasePackages = {
//		"com.PangProject",
//		"com.demo.exceptions",
//		"com.demo.util.config"
//	})
@SpringBootApplication
public class PangApplication {

	public static void main(String[] args) {
		SpringApplication.run(PangApplication.class, args);
	}

}
