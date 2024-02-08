package day5;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ParsingXmlResponse {
	
	@Test(priority=1, enabled=false)
	void testXmlResponse() {
		
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1")
		
		.then()
			.statusCode(200)
			.header("Content-Type", "application/xml; charset=utf-8")
			.body("TravelerinformationResponse.page", equalTo("1"))
			.body("TravelerinformationResponse.travelers.Travelerinformation[0].name", equalTo("Developer"));
		
	}
	
	@Test(priority=2, enabled=true)
	void testXmlResponseApproach2() {
		
		Response res = given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.getStatusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset=utf-8");
		
		String pageNo = res.xmlPath().get("TravelerinformationResponse.page").toString();
		Assert.assertEquals(pageNo, "1");
		
		String travelerName = res.xmlPath().get("TravelerinformationResponse.travelers.Travelerinformation[0].name").toString();
		Assert.assertEquals(travelerName, "Developer");
		
	}
	
	@Test(priority=3, enabled=true)
	void testXmlResponseApproach3() {
		
		Response res = given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlObj = new XmlPath(res.asString());
		
		//list of all tavelers
		List<String> travellers = xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation");
		Assert.assertEquals(travellers.size(), 10);
		
		//verify traveller name
		List<String> travellerNames = xmlObj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		System.out.println(travellerNames);
		boolean status = false;
		for(String travellerName : travellerNames)
		{
			if(travellerName.equals("Developer"))
			{
				status = true;
				break;
			}
			Assert.assertEquals(status, true);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
