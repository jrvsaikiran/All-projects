package stepdefinition;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.omg.CORBA.PUBLIC_MEMBER;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class Steps {
	
	 RemoteWebDriver driver;
	public LoginPage lp;
	
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    lp = new LoginPage(driver);
	    
	}
	
	@When("user opens url")
	public void user_opens_url() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    
	}
	
	@And("user enters email and password")
	public void user_enters_email_as_and_password_as() {
		
		driver.findElementById("Email").clear();
		driver.findElementById("Email").sendKeys("admin@yourstore.com");
		
		driver.findElementById("Password").clear();
		driver.findElementById("Password").sendKeys("admin");
		System.out.println(driver.getTitle());
		

		
	}
	
	@And("^user enters email \"(.*)\" and password \"(.*)\"$")
	public void user_enters_email_as_and_password(String email, String password) {
		
		//driver.findElementById("Email").clear();
		//driver.findElementById("Email").sendKeys(email);
		
		lp.setUserName(email);
		
		//driver.findElementById("Password").clear();
		//driver.findElementById("Password").sendKeys(password);
		lp.setPassword(password);
		
	}
	
	@Then("page title should be")
	public void page_title_should_be() {
		if(driver.getPageSource().contains("Your store. Login")) {
			Assert.assertTrue(true);
			System.out.println(driver.getTitle());
		}
		
		else if(driver.getPageSource().contains("Dashboard / nopCommerce administration")){	
			Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
			//driver.getPageSource().contains("Dashboard / nopCommerce administration");
			Assert.assertTrue(true);
			System.out.println(driver.getTitle());
		}
		else {
			Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.", 
					driver.findElement(By.xpath("//h1[text()=\"Admin area demo\"]//following::div[4]")).getText());
			
			Assert.assertTrue(true);
			driver.close();
			}
	}
	

	@When("user clicks on login")
	public void user_clicks_on_login() {
		//driver.findElementByXPath("//button[text()=\"Log in\"]").click();
		lp.clickLogin();
	    
	}
	
	@When("user clicks on logout")
	public void user_clicks_on_logout() throws Throwable  {
		//driver.findElementByXPath("//a[text()=\"Logout\"]").click();
		lp.clickLogOut();
}
	
	@And("close browser.")
	public void close_browser() {
		
		driver.close();
		}
	
	//addcustomer
	
	@Then("User can view Dashboad")
	public void user_view_dashboad() {
		Assert.assertEquals("Dashboard / nopCommerce administration", driver.getTitle());
	}
	
	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
	    driver.findElement(By.xpath("//i[@class=\"nav-icon far fa-user\"]")).click();
	}
	
	@And("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		driver.findElement(By.xpath("//p[text()=\" Customers\"]")).click();
	}
	
	@And("click on Add new button")
	public void click_on_Add_new_button() {
		driver.findElement(By.linkText("Add new")).click();
	}
	
	
	
	@Then("User can view Add new customer page {string}")
	public void user_can_view_add_new_customer_page(String string) {
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),\"Add a new customer\")]")).getText());
		Assert.assertEquals(string, driver.findElement(By.xpath("//h1[contains(text(),\"Add a new customer\")]")).getText());
	}
	   
	
	
	
	
	
	
	

}
