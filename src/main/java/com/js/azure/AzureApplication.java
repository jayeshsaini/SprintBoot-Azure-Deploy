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
	
	@GetMapping("/Customer")
	public String registerCustomer() {
		String htmlContent = "<html>\n"
				+ "<head>\n"
				+ "<meta charset=\"ISO-8859-1\">\n"
				+ "<title>Customer</title>\n"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/style.css\">\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "	<h1>Customer</h1>\n"
				+ "	<h3>Register Customer</h3>\n"
				+ "	<form action=\"PatientCreate\" method=\"post\">\n"
				+ "		<label>Name: </label> <input type=\"text\" name=\"name\" /> <br> \n"
				+ "		<label>Age:	</label> <input type=\"text\" name=\"age\" /> <br> \n"
				+ "		\n"
				+ "		<label>Mode: </label> <input type=\"text\" name=\"mode\" /> <br> \n"
				+ "		<label>Destination: </label> <input type=\"text\" name=\"dest\" /> <br> \n"
				+ "		<label>Origin: </label> <input type=\"text\" name=\"origin\" /> <br> \n"
				+ "		<label>Date: </label> <input type=\"date\" name=\"date\" /> <br> \n"
				+ "		<input type=\"submit\" value=\"Book Itinerary\" />\n"
				+ "	</form>\n"
				+ "\n"
				+ "\n"
				+ "	<form method=\"post\" action=\"Travel.jsp\">\n"
				+ "		<button type=\"submit\">Show Bookings</button>\n"
				+ "	</form>\n"
				+ "\n"
				+ "</body>\n"
				+ "</html>";
		return htmlContent;
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
