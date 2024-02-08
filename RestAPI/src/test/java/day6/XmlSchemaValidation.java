package day6;



import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;

public class XmlSchemaValidation {
	
	@Test()
	void xmlSchemaValidation() {
		
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1")
		
		.then()
			.statusCode(200)
			//.log().all()
			.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("xmlvalidator.xsd"));

}
}



