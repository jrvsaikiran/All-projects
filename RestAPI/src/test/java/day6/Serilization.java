package day6;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import day2.Pojo_PostRequest;

public class Serilization {
	
	//Serilization = pojo to json
	//deSerilization = json to pojo
	
	@Test(priority=1,enabled=true)
	void convertPOJO2JSON() throws JacksonException {
		
		//create java obj using pojo class
		Student data = new Student();
		data.setEmail("kiran@gmail.com");
		data.setFirst_name("jrv");
		data.setLast_name("kiran");
		data.setAvatar("https://reqres.in/img/faces/7-image.jpg");
		
		//convete java obj to json obj
		ObjectMapper objMapper = new ObjectMapper();
		String json = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println("Serilization = pojo to json"+json);		
	}
	
	
	@Test(priority=2,enabled=true)
	void convertjson2Pojo() throws JacksonException {
		
		//create java obj using pojo class
		String jsonData = "{\r\n" + 
				"  \"email\" : \"kiran@gmail.com\",\r\n" + 
				"  \"first_name\" : \"jrv\",\r\n" + 
				"  \"last_name\" : \"kiran\",\r\n" + 
				"  \"avatar\" : \"https://reqres.in/img/faces/7-image.jpg\"\r\n" + 
				"}";
		
		
		//convete json obj to pojo
		ObjectMapper objMapper = new ObjectMapper();
		Student stuPojo = objMapper.readValue(jsonData, Student.class);
		
		System.out.println(stuPojo.getAvatar());
		System.out.println(stuPojo.getEmail());
		System.out.println(stuPojo.getFirst_name());
		System.out.println(stuPojo.getLast_name());
		System.out.println(stuPojo.getClass());
		
		
		
	}

}
