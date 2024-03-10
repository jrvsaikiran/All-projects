package day2;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;




public class PostRequestByOrgJson {
	int id;
	
	//org.json libeary post method
	
	@Test(priority=1, enabled=true, invocationCount=10)
	void PostByOrgJson() {
		
		JSONObject data = new JSONObject();
		data.put("email", "sai@gmail.com");
		data.put("first_name", "jrv");
		data.put("last_name", "kiran");
		data.put("avatar", "https://reqres.in/img/faces/7-image.jpg");
		System.out.println(data);
		
		 
		given()
			.contentType("application/json")
			.body(data.toString())
		
		.when()
			.post("http://localhost:3000/Students")
			//.jsonPath().getInt("id");
		
		.then()
			.statusCode(201)
			.body("email", equalTo("sai@gmail.com"))
			.body("first_name",equalTo("jrv"))
			.body("last_name", equalTo("kiran"))
			.body("avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"))
			//.body("courses[0]", equalTo("c"))
			.log().all();		
	}
	
	//pojo post method
	@Test(priority=2, enabled=true , invocationCount=10)
	void PostByPojoClass() {
		
		Pojo_PostRequest data = new Pojo_PostRequest();
		data.setEmail("kiran@gmail.com");
		data.setFirst_name("jrv");
		data.setLast_name("kiran");
		data.setAvatar("https://reqres.in/img/faces/7-image.jpg");
		
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("http://localhost:3000/Students")
			//.jsonPath().getInt("id");
		
		.then()
			.statusCode(201)
			.body("email", equalTo("kiran@gmail.com"))
				.body("email",equalTo(data.getEmail()))
			.body("first_name",equalTo("jrv"))
			.body("last_name", equalTo("kiran"))
			.body("avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"))
			//.body("courses[0]", equalTo("c"))
			.log().all();		
	}
	
	
	//External json file  post method
	@Test(priority=3, enabled=true , invocationCount=10)
	
	void PostByExternalJsonFile() throws FileNotFoundException {
		
		File f = new File(".\\body.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject data = new JSONObject(jt);
		
		given()
			.contentType("application/json")
			.body(data.toString())
		
		.when()
			.post("http://localhost:3000/Students")
			//.jsonPath().getInt("id");
		
		.then()
			.statusCode(201)
			.body("email", equalTo("kiran@gmail.com"))
			.body("first_name",equalTo("jrv"))
			.body("last_name", equalTo("kiran"))
			.body("avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"))
			//.body("courses[0]", equalTo("c"))
			.log().all();		
	}
	
	
	
	
	
	
	
}