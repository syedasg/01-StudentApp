package com.university.StudentDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@ComponentScan
public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
		System.out.print("Main");


	}

	@Bean
	public Student studentBean(){
		System.out.print("From Bean Annotation");
		return new Student();
	}

	@Bean
	public Address AddressBean(){
		return new Address();
	}

}
