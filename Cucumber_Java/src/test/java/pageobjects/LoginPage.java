package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		super(); 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	public LoginPage(WebDriver rdriver) {
//		Idriver = rdriver;
//		PageFactory.initElements(rdriver, this);
//	}
	
	@FindBy(id= "Email")
	@CacheLookup
	WebElement txtemail;
	
	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[text()=\"Log in\"]")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath = "//a[text()=\"Logout\"]")
	@CacheLookup
	WebElement btnlogout;
	
	
	public void setUserName(String uname) {
		txtemail.clear();
		txtemail.sendKeys(uname);
	}
	
	public void setPassword(String upaswrd) {
		txtpassword.clear();
		txtpassword.sendKeys(upaswrd);
	}
	
	public void clickLogin() {
		btnlogin.click();
	}
	
	public void clickLogOut() {
		btnlogout.click();
	}
	
	 
	
	

}
