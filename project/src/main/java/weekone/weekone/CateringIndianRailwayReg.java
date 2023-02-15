package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CateringIndianRailwayReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ftr.irctc.co.in/ftr/");

		driver.findElementByXPath("//*[@id=\"planner\"]/table/tbody/tr[4]/td[2]/div/a[2]").click();

		Thread.sleep(3000); 

		driver.findElementById("userId").sendKeys("Ss_8985saikiran");

		driver.findElementById("password").sendKeys("Ss@8985891589");

		driver.findElementById("cnfPassword").sendKeys("Ss@8985891589");

		driver.findElementById("secAnswer").sendKeys("i am the don");

		// driver.findElementById("dateOfBirth").sendKeys("03111995");

		driver.findElementById("gender0").click();

		driver.findElementByXPath("//*[@id=\"maritalStatus1\"]").click();

		driver.findElementById("email").sendKeys("saikiranjrv@gmail.com");

		driver.findElementById("fname").sendKeys("jakkula");

		driver.findElementById("mname").sendKeys("raja venkata");

		driver.findElementById("lname").sendKeys("sai kiran");

		driver.findElementById("flatNo").sendKeys("10-5-55");

		driver.findElementById("street").sendKeys("park road");

		driver.findElementById("area").sendKeys("sattenapalli");

		// driver.findElementById("isdPrefix").sendKeys("91");
		driver.findElementById("mobile").sendKeys("8985891589");

		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);

		// driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
		// driver.findElementByName("sameAddresses").click();
		driver.findElementById("sameAddresses1").click();

		driver.findElementById("flatNoOffice").sendKeys("fllat no 102");

		driver.findElementById("streetOffice").sendKeys("my own adda");

		driver.findElementById("areaOffice").sendKeys("galli street");

		driver.findElementById("mobileOffice").sendKeys("8985891589");

		driver.findElementByXPath("/html/body/div[2]/form/div/div[2]/table/tbody/tr[37]/td/button").click();

	}

}
