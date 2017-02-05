package com.accedius;

import com.accedius.domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PostitApplication{

    @Autowired
    private PostRepository repository;

	public static void main(String[] args) {

        SpringApplication.run(PostitApplication.class, args);
	}
}
