package day2;

import org.testng.annotations.Test;   

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class DifferentWaysToCreatePostRequestBody {
	int id;
	
	@Test(priority=1)
	void PostByMap() {
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("email", "sai@gmail.com");
		data.put("first_name", "jrv");
		data.put("last_name", "kiran");
		data.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		
//		String courseArray[] = {"c","c++"};
//		data.put("courses", courseArray);
		
		id = given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("http://localhost:3000/Students")
			.jsonPath().getInt("id");
		
//		.then()
//			.statusCode(201)
//			.body("email", equalTo("sai@gmail.com"))
//			.body("first_name",equalTo("jrv"))
//			.body("last_name", equalTo("kiran"))
//			.body("avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"))
//			//.body("courses[0]", equalTo("c"))
//			.log().all();		
	}

	@Test(priority=2)
	void deleteByMap() {
		
		given()
		
		.when()
			.delete("http://localhost:3000/Students/"+id)
		
		.then()
			.statusCode(200);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
