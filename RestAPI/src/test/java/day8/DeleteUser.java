package day8;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DeleteUser {
	
	@Test()
	void testDeleteUser(ITestContext Context) {
		
		String bearerToken = "6da4f2651f73b9f4296247f4a9dc8fbb926878c19212d6af2c69edbce5e692f7";
		int id =  (Integer) Context.getSuite().getAttribute("user_id");
		
		given()
			.header("Authorization", "Bearer "+bearerToken)		
			.pathParam("id", id)
		
		.when()
			.delete("https://gorest.co.in/public/v2/users/{id}")
		
		.then()
			.statusCode(204);
			
		
	}

}
