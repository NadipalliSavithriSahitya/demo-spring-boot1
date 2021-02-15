package com.ass.demospringboot;

import com.ass.demospringboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringBootApplication {



	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);


	}

}
