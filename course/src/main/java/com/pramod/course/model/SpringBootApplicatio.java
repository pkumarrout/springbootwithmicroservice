package com.pramod.course.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "com.pramod.course.controller", "com.pramod.course.*" ,"com.pramod.course.serviceImpl"})
public class SpringBootApplicatio {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootApplicatio.class, args);

	}

}
