package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class PathAndQuaryParameters {

	@Test()
	void testPathAndQuaryParameters() {
		
		//https://reqres.in/api/users?page=2&id=5
		given()
			.pathParam("mypath", "users")	//path param
			.queryParam("page", 1)		//query param			
			.queryParam("id", 3)		//query param
			//.queryParam("last_name", "Wong")
		
		.when()
			.get("https://reqres.in/api/{mypath}")
		
		.then()
			.statusCode(200)
			.log().all();
		
		
	}
	
}
