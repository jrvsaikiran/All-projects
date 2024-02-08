package day5;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

public class FileUploadandDownload {
	
	@Test(priority=1,enabled=false)
	
	void singleFileUpload() {
		File myFile = new File("F:\\RestAssured API youtube\\sai.txt");
		
		given()
			.multiPart("file", myFile)
			.contentType("multipart/form-data")
		
		.when()
			.post("http://localhost:8080/uploadFile")
		
		.then()
			.statusCode(200)
			
			.body("fileName", equalTo("sai.txt" ))
			.log().all();
		
	}
	
	@Test(priority=2,enabled=true)
	
	void multipleFileUpload() {
		File myFile1 = new File("F:\\RestAssured API youtube\\sai.txt");
		File myFile2 = new File("F:\\RestAssured API youtube\\dummy.txt");
		
		given()
			.multiPart("files", myFile1)
			.multiPart("files", myFile2)
			.contentType("multipart/form-data")
		
		.when()
			.post("http://localhost:8080/uploadMultipleFiles")
		
		.then()
			.statusCode(200)
			
			.body("[0].fileName", equalTo("sai.txt" ))
			.body("[1].fileName", equalTo("dummy.txt" ))
			
			.log().all();
		
	}
	
	@Test(priority=3)
	void chechDownloadedFile() {
		given()
		
		.when()
			.get("http://localhost:8080/downloadFile/sai.txt")
		
		.then()
			.statusCode(200)
			.log().all();
	
	}

}
