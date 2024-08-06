package allweeks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PanIndiaAppication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://panind.com/india/new_pan/#");
		
		WebElement title = driver.findElementById("pan_title");
		Select gender = new Select(title);
		gender.selectByIndex(1);

		driver.findElementById("pan_firstname").sendKeys("jakkula");

		driver.findElementById("pan_middlename").sendKeys("raja venkata");

		driver.findElementById("pan_lastname").sendKeys("sai kiran");

		driver.findElementById("pan_fatherfirstname").sendKeys("jakkula");

		driver.findElementById("pan_fathermiddlename").sendKeys("srinivasarao");

		driver.findElementById("pan_fatherlastname").sendKeys("jakkula");

		driver.findElementByName("pan_mobilenumber").sendKeys("89858891589");

		driver.findElementByName("pan_email").sendKeys("saikiranjrv@gmail.com");

		WebElement income = driver.findElementById("pan_sourceofincome");
		Select source = new Select(income);
		source.selectByIndex(3);
		Thread.sleep(2000);
		WebElement profession = driver.findElementById("pan_businessprofession");
		Select type = new Select(profession);
		type.selectByIndex(6);
		Thread.sleep(2000);
		
		// driver.findElementByXPath("//*[@id=\"residence\"]").click();
		driver.findElementById("office").click();
		// driver.findElementByName("pan_dob").sendKeys("03111995");
		// driver.findElementById("pan_dob").sendKeys("03111985");
		driver.findElementByXPath("//*[@id=\"pan_dob\"]").sendKeys("03111995");

		// driver.findElementByCssSelector("body").sendKeys(Keys.CONTROL, Keys.END);
		// driver.findElementByXPath(“//html/body”).sendKeys(Keys.PAGEDOWN);
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);

		driver.findElementByName("pan_addressline1").sendKeys("park road sattenapalli");

		driver.findElementByName("pan_addressline2").sendKeys("park road sattenapalli");

		driver.findElementByName("pan_cityname").sendKeys("sattenapalli");

		WebElement state = driver.findElementById("pan_state");
		Select sc = new Select(state);
		sc.selectByIndex(2);
		
		driver.findElementById("pan_pincode").sendKeys("522403");
		// driver.findElementByXPath("//*[@id=\"pan_pincode\"]").sendKeys("522403");

		driver.findElementById("pan_officename").sendKeys("jrvmachines");

		driver.findElementById("pan_officeaddressline1").sendKeys("srm estates");

		driver.findElementById("pan_officeaddressline2").sendKeys("4th line");

		driver.findElementById("pan_officecityname").sendKeys("sattenapalli");

		driver.findElementById("pan_officepincode").sendKeys("522403");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		
		WebElement idProof = driver.findElementById("pan_identityproof");
		Select sc1 = new Select(idProof);
		sc1.selectByIndex(2);
		
		WebElement addProof = driver.findElementById("pan_addressproof");
		Select sc2 = new Select(addProof);
		sc2.selectByIndex(2);
		
		WebElement dobProof = driver.findElementById("pan_DOBproof");
		Select sc3 = new Select(dobProof);
		sc3.selectByIndex(2);
		
		WebElement adarProof = driver.findElementById("pan_aadhaarproof");
		Select sc4 = new Select(adarProof);
		sc4.selectByIndex(2);
		
		WebElement officeProof = driver.findElementById("pan_officeaddressproof");
		Select sc5 = new Select(officeProof);
		sc5.selectByIndex(2);
		
		driver.findElementById("pan_source").click();
		
		
		
		
		
	}

}
