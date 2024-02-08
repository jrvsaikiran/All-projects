package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	//public LoginPage lp;
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
//	    
//	    driver.manage().window().maximize();
		System.out.println("hai");
		//lp = new LoginPage(driver);
	    
	    
	}
	
	@When("user opens url {string}")
	public void user_opens_url(String url) {
//		driver.get(url);
		System.out.println("hai");
	    
	}
	
	@And("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
//	   lp.setUserName(email);
//	   lp.setPassword(password);
		System.out.println("hai");
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
//		if(driver.getPageSource().contains("Login was unsuccessfull")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}
//		else {
//			Assert.assertEquals(title, driver.getTitle());
//		}
		System.out.println("hai");
	    
	}
	

	@When("user clicks on login")
	public void user_clicks_on_login() {
		//lp.clickLogin();
		System.out.println("hai");
	    
	}
	
	@When("user clicks on logout")
	public void user_clicks_on_logout() {
		//lp.clickLogOut();
		System.out.println("hai");
	    
	}
	
	@And("close browser.")
	public void close_browser() {
		//driver.quit();
		System.out.println("hai");
		
	    
	}

}
