package weekone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		
//		driver.findElementByXPath("");
//		driver.findElement(By.xpath(""));
//		
//		driver.navigate().forward();
		
		
		
		//driver.findElementByPartialLinkText("English (UK)").click();

		driver.findElementByLinkText("Create new account").click();

		Thread.sleep(5000);

		
		String name = "jrvsaikiran"; 
		
		driver.findElementByName("firstname").sendKeys(name);

		driver.findElementByName("lastname").sendKeys("jakkularajavenkata");

		driver.findElementByName("reg_email__").sendKeys("saikiranjrv@gmail.com");

		driver.findElementByName("reg_email_confirmation__").sendKeys("saikiranjrv@gmail.com");

		driver.findElementById("password_step_input").sendKeys("8985891589");
		
		
		WebElement birth = driver.findElementById("day");
		Select sc = new Select(birth);
		sc.selectByVisibleText("17");
		
		WebElement month = driver.findElementById("month");
		Select sc1 = new Select(month);
		sc1.selectByIndex(2);
		
		WebElement year = driver.findElementById("year");
		Select sc2 = new Select(year);
		sc2.selectByIndex(2);

		driver.findElementByXPath("(//input[@name='sex'])[2]").click();

	}

}
