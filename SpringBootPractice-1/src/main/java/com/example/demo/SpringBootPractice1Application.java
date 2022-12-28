package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootPractice1Application 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootPractice1Application.class, args);
		People a = context.getBean(People.class);
		a.disp();
	}
}
