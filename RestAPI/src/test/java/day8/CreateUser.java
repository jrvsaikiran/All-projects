package day8;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

//import net.minidev.json.JSONObject;

public class CreateUser {
	
	@Test()
	void testCreateUser(ITestContext Context) {
		
		Faker fake = new Faker();
		
		JSONObject data = new JSONObject();
		data.put("name", fake.name().firstName().toUpperCase());
		data.put("gender", "Male");
		data.put("email", fake.internet().emailAddress());
		data.put("status", "inactive");
		
		String bearerToken = "6da4f2651f73b9f4296247f4a9dc8fbb926878c19212d6af2c69edbce5e692f7";
		
		int id = given()
			.header("Authorization", "Bearer "+bearerToken)
			.contentType("application/json")
			.body(data.toString())
		
		.when()
			.post("https://gorest.co.in/public/v2/users")
			.jsonPath().getInt("id");
			
		
		System.out.println(id);
		
		Context.getSuite().setAttribute("user_id", id);
		
		
	}

}
