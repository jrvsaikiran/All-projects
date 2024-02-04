package weekone;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelReg {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		@Test()
		public void php() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.phptravels.org/register.php");

		Thread.sleep(5000);

		driver.findElementById("inputFirstName").sendKeys("jakkularajavenkata");

		driver.findElementById("inputLastName").sendKeys("saikiran");

		driver.findElementById("inputEmail").sendKeys("saikiranjrv@gmail.com");

		driver.findElementById("inputPhone").sendKeys("8985891589");

		driver.findElementById("inputCompanyName").sendKeys("srmtechnologies");

		driver.findElementByName("address1").sendKeys("parkroad");

		driver.findElementByXPath("//*[@id=\"inputAddress2\"]").sendKeys("sattenapalli");

		driver.findElementById("inputCity").sendKeys("guntur");

		// driver.findElementById("stateinput").sendKeys("Andhra Pradesh");

		driver.findElementById("stateinput").sendKeys("Tamil Nadu");

		// driver.findElementByXPath("//*[@id=\"stateinput\"]").sendKeys("andhrapradesh");

		// driver.findElementByName("state").sendKeys("ap");

		driver.findElementById("inputPostcode").sendKeys("522403");

		driver.findElementById("inputCountry").sendKeys("India");

		driver.findElementByName("customfield[2]").sendKeys("8985891589");

		driver.findElementByXPath("//*[@id=\"inputNewPassword1\"]").sendKeys("Ss@8985891589");

		driver.findElementByXPath("//*[@id=\"inputNewPassword2\"]").sendKeys("Ss@8985891589");

		//driver.findElementByXPath("//*[@id=\"frmCheckout\"]/div[3]/div/div/span[1]").click();

		// driver.findElementByXPath("//*[@id=\"recaptcha-anchor\"]/div[1]").click();

	}

}
