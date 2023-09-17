package com.devsam.housemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class HousemanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HousemanagementApplication.class, args);
	}

}
