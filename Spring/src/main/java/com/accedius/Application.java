package com.accedius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@SpringBootApplication

@RequestMapping("/")
public class Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

}
