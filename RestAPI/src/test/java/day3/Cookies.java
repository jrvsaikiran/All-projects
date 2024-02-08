package day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Cookies {
	
	@Test(priority=1, enabled=false)
	
	void cookies() {
		
		given()
		
		.when()
			.get("https://www.google.co.in/")
		
		.then()
			.statusCode(200)
			.cookie("AEC","ARSKqsLBjAzG-IBX8ZIckH0EbRJ89u8ercfzTnoBLjI1PblvhaFy8WIhFQ")
			.log().all();
		
	}
	
	@Test(priority=2, enabled=true)
	
	void getValueOfCookies() {
		
		Response res =given()
		
		.when()
			.get("https://www.google.co.in/");
			
		//get single cookie
			String cookieValue = res.getCookie("AEC");
			System.out.println("AEC value is  "+cookieValue);
		
		//get multiple cookies
			Map<String, String> allCookies = res.getCookies();
			System.out.println(allCookies.keySet());
			
			for(String k : allCookies.keySet())
			{
				String cookieValues = res.getCookie(k);
				System.out.println(k+ "====== values is ===== "+cookieValues);
				
			}
			
		
		
	}


}
