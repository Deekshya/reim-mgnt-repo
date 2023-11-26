package com.reim.mgnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ReimMgntApplication {

	@GetMapping("/reachReimMgnt")
	public String getMessage() {
		return "Docker Message: You have reached Reim Mgnt!!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ReimMgntApplication.class, args);
	}

}
