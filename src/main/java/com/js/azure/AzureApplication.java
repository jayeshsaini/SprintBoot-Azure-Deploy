package com.js.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication {
	
	@GetMapping("/message")
	public String message() {
	    String htmlContent = "<html><body><h1>Congrats</h1><p>You have successfully deployed your Spring Boot application to Azure.</p></body></html>";
	    return htmlContent;
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
