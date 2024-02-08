package day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerate {
	
	@Test()
	void fakerGenerate() {
		
		Faker faker = new Faker();
		
		String name = faker.address().country().toUpperCase();
		System.out.println(faker.ancient().hero());
		System.out.println(name);
		
		
		
	}

}
