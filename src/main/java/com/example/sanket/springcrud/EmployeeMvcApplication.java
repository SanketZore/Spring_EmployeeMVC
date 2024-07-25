package com.example.sanket.springcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.sanket.mvcproject.controllers"})
public class EmployeeMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMvcApplication.class, args);
		System.out.println("Application Running...");
	}

}
