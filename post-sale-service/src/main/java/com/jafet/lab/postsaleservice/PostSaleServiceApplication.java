package com.jafet.lab.postsaleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PostSaleServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PostSaleServiceApplication.class, args);
	}
	
}
