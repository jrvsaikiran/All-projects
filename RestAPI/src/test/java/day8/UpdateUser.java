package day8;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import net.minidev.json.JSONObject;

public class UpdateUser {
	
	@Test()
	void testUpdateUser(ITestContext Context) {
		
Faker fake = new Faker();
		
		JSONObject data = new JSONObject();
		data.put("name", fake.name().fullName().toLowerCase());
		data.put("gender", "Male");
		data.put("email", fake.internet().emailAddress());
		data.put("status", "active");
		
		String bearerToken = "6da4f2651f73b9f4296247f4a9dc8fbb926878c19212d6af2c69edbce5e692f7";
		
		int id =  (Integer) Context.getSuite().getAttribute("user_id");
		
		 given()
			.header("Authorization", "Bearer "+bearerToken)
			.contentType("application/json")
			.pathParam("id", id)
			.body(data.toString())
		
		.when()
			.put("https://gorest.co.in/public/v2/users/{id}")
			
		.then()
			.statusCode(200)
		 	.log().body();			
		
		
	}

}
