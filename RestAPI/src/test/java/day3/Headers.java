package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.response.Response;

public class Headers {
	
	@Test(priority=1, enabled=true)
	
	void header() {
		
		given()
		
		.when()
			.get("https://www.google.co.in/")
		
		.then()
			.header("Content-Type", "text/html; charset=ISO-8859-1")
			.header("Cache-Control", "private, max-age=0")
			.header("Server", "gws")
			.header("Content-Encoding", "gzip")
			.log().headers();
		
		
	}
	
	@Test(priority=2, enabled=false)
	
	void getHeader() {
		
		Response res = given()
		
		.when()
			.get("https://www.google.co.in/");
		
		
		//get single header
		String header = res.getHeader("Content-Type");
		System.out.println(header);
		
		//get multiple headers
		
		io.restassured.http.Headers allHeaders = res.getHeaders();
		for(Header hd : allHeaders)
		{
			System.out.println(hd.getName()+"========"+hd.getValue());
		}
		
		
		
		
		
	}
			

}
