package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.example.security.dao.*")
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
