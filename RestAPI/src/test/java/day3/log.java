package day3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class log {
	
	@Test( priority=1, invocationCount=1)	
	void getUser() 
	{
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			//.log().body()
			//.log().status()
			//.log().headers()
			.log().cookies();
		
	}

}
