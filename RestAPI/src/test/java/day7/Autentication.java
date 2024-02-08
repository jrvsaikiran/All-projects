package day7;


import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Autentication {
	
	@Test(priority=1, enabled=false)
	void basicAuth() {
		
		given()
		.auth().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			
			.body("authenticated", equalTo(true))
			
			.log().all();
		
		
	}
	
	@Test(priority=2, enabled=true)
	void digestAuth() {
		
		given()
		.auth().digest("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			
			.body("authenticated", equalTo(true))
			
			.log().all();
		
		
	}

	@Test(priority=3, enabled=true)
	void preemtiveAuth() {
		
		given()
		.auth().preemptive().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		.then()
			.statusCode(200)
			
			.body("authenticated", equalTo(true))
			
			.log().all();
		
		
	}

}
