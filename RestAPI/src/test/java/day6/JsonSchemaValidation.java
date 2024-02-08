package day6;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.module.jsv.JsonSchemaValidator;

import org.testng.annotations.Test;

public class JsonSchemaValidation {
	
	@Test()
	void jsonSchemaValidation() {
		
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Customer")
		
		.then()
			
			.statusCode(200)
			.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("jsonschemavalidation.json"));
					//matchesJsonSchemaInClasspath("jsonschema-validation.json") );
					
	}

}
