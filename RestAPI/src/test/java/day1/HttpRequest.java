package day1;

import org.testng.annotations.Test;  

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
	
	int id;
	

	@Test( priority=1, invocationCount=1)	
	void getUser() 
	{
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("page",equalTo(2));
			//.log().all();				
	}
	
	@Test(priority=2, invocationCount=10)
	void createUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "sai");
		data.put("job", "software");
		System.out.println(data);
		
		id = given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
	}
	
	@Test(priority=3, dependsOnMethods= {"createUser"})
	void updateUser() {
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("name", "jack");
		data.put("job", "IT");
		System.out.println(data);
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.put("https://reqres.in/api/users"+id)
			
		
		.then()
			.statusCode(201);
			//.log().all();
		
	}
	
	@Test(priority=4)
	void deleteUser() {
		
		given()
		
		.when()
			.delete("https://reqres.in/api/users/ "+id)
		
		.then()
			.statusCode(204);
			//.log().all();
		
		
	}
	
	

}
