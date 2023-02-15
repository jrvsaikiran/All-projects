package weekone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndianBureauOfImmigration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");

		driver.findElementByXPath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a").click();

		driver.findElementById("u_id").sendKeys("Kasai02011010");

		Thread.sleep(3000);

		driver.findElementById("u_pwd").sendKeys("Ss@8985891589");

		// driver.findElementById("u_repwd").sendKeys("Ss@8985891589");
		driver.findElementByXPath("//*[@id=\"u_repwd\"]").sendKeys("Ss@8985891589");
		Thread.sleep(3000);
		//WebElement sequrityQuestion = driver.findElementById("u_secques");
		WebElement sequrityQuestion = driver.findElementByXPath("//*[@id=\"u_secques\"]");
		Select question = new Select(sequrityQuestion);
		question.selectByIndex(4);
		
		driver.findElementById("u_secans").sendKeys("my name is khan");

		driver.findElementById("u_name").sendKeys("jakkula raja venkata sai kiran");

		WebElement gender = driver.findElementById("u_gender");
		Select value = new Select(gender);
		value.selectByIndex(1);
		
		driver.findElementById("u_dob").sendKeys("03/11/1995");

		driver.findElementById("u_designation").sendKeys("M.Tech");

		driver.findElementById("u_emailid").sendKeys("saikiranjrv@gmail.com");

		driver.findElementByXPath("//*[@id=\"u_mobile\"]").sendKeys("8985891589");

		driver.findElementByName("u_phone").sendKeys("9848022338");

		driver.findElementByXPath("//*[@id=\"name\"]").sendKeys("meranam sai hey");

		driver.findElementById("capacity").sendKeys("500");

		driver.findElementById("address").sendKeys("park road sattenapalli 5222403");
		Thread.sleep(3000);
		WebElement state = driver.findElementById("state");
		Select sc = new Select(state);
		sc.selectByIndex(2);
		Thread.sleep(3000);
		WebElement district = driver.findElementById("city_distr");
		Select sc1 = new Select(district);
		sc1.selectByIndex(4);
		Thread.sleep(3000);
		
		WebElement description = driver.findElementById("frrodata");
		Select sc2 = new Select(description);
		sc2.selectByIndex(1);
		Thread.sleep(3000);
		
		WebElement accomodationType = driver.findElementById("acco_type");
		Select sc3 = new Select(accomodationType);
		sc3.selectByIndex(6);
		Thread.sleep(3000);
		
		WebElement grade = driver.findElementById("star_rat");
		Select sc4 = new Select(grade);
		sc4.selectByIndex(5);
		Thread.sleep(3000);
		
		
		driver.findElementById("email").sendKeys("saikiranjrv@gmail.com");

		driver.findElementById("mcontact").sendKeys("8985891589");

		driver.findElementById("contact").sendKeys("8985891589");

		driver.findElementByName("name_o").sendKeys("rajadiraja");

		driver.findElementByName("address_o").sendKeys("D.no 420 street.empower, star galaxy town");

		WebElement ownerState = driver.findElementById("state_o");
		Select sc5 = new Select(ownerState);
		sc5.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement ownerCity = driver.findElementById("citydistr_o");
		Select sc6 = new Select(ownerCity);
		sc6.selectByIndex(2);
		Thread.sleep(3000);
		
		
		
		driver.findElementByName("emailid_o").sendKeys("saikiranjrv@gmail.com");

		driver.findElementByXPath(
				"/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[6]/input")
				.sendKeys("8985891589");

		driver.findElementByName("mobile_o").sendKeys("8985891589");

		// driver.findElementByName("captchaval").sendKeys("s4wase");

	}

}
