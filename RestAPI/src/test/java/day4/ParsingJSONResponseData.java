package day4;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;

public class ParsingJSONResponseData {
	
	//approach = 1
	@Test(priority=1,enabled=false,invocationCount=1)
	void testJsonResponse() {
		
		given()
			.contentType("ContentType/Json")
		
		.when()
			.get("http://localhost:3000/Students")
		.then()
			.statusCode(200)
			.header("Content-Type", "application/json; charset=utf-8")
			.body("[10].email", equalTo("sai@reqres.in"));
		
	}
	
	//approach = 2  most preferrable
		@Test(priority=2,invocationCount=1, enabled=false)
		void testJsonResponse2() {
			
		Response res =	given()
				.contentType("ContentType/Json")
			
			.when()
				.get("http://localhost:3000/Students");
			
			Assert.assertEquals(res.getStatusCode(), 200);
			Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");
			
			String email = res.jsonPath().get("[10].email").toString();
			Assert.assertEquals(email, "sai@reqres.in");
			
			
		}
		
		//approach = 3  most preferrable
		@Test(priority=3,invocationCount=1)
		void testJsonResponse3() {
			
		Response resp =	given()
				.contentType(ContentType.JSON)
			
			.when()
				.get("http://localhost:3000/Students");
			

		
		JSONObject js = new JSONObject(resp.asString());	//converting responce to json object type


			for(int i=0; i<js.getJSONArray("Students").length();i++)
		{
			
			 String id = js.getJSONArray("Students").getJSONObject(i).get("id").toString();
			 System.out.println(id);
		}
		
			
			
		}

}
