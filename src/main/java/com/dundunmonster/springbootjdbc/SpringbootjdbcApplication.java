package com.dundunmonster.springbootjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.dundunmonster.springbootjdbc"})
public class SpringbootjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcApplication.class, args);
	}

}

