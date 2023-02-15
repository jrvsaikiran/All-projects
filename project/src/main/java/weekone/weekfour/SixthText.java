package weekfour;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SixthText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a").click();
		driver.findElementById("u_id").sendKeys("Ss@sai8989");
		driver.findElementById("u_pwd").sendKeys("Ss@8985891589");
		driver.findElementById("u_repwd").sendKeys("Ss@8985891589");
		
		WebElement securityQuestion = driver.findElementById("u_secques");
		Select sc = new Select(securityQuestion);
		sc.selectByIndex(3);
		
		driver.findElementById("u_secans").sendKeys("kiranbiography");
		driver.findElementById("u_name").sendKeys("jrvsaikiran");
		
		WebElement gender = driver.findElementByXPath("//*[@id=\"u_gender\"]");
		Select sc1 = new Select(gender);
		sc1.selectByIndex(1);
		
		driver.findElementById("u_dob").sendKeys("03/11/1995");
		driver.findElementById("u_designation").sendKeys("software");
		driver.findElementById("u_emailid").sendKeys("saikiranjrv@gmail.com");
		driver.findElementById("u_mobile").sendKeys("8985891589");
		driver.findElementById("u_phone").sendKeys("08612338559");
		
		WebElement nationality = driver.findElementById("u_nationality");
		Select sc2 = new Select(nationality);
		sc2.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		driver.findElementById("name").sendKeys("kiran");
		driver.findElementById("capacity").sendKeys("500");
		driver.findElementById("address").sendKeys("park road");
		
		//WebElement state = driver.findElementById("state");
		WebElement state = driver.findElementByXPath("//*[@id=\"state\"]");
		Select sc3 = new Select(state);
		sc3.selectByIndex(2);
		Thread.sleep(2000);
		
		//WebElement district = driver.findElementById("city_distr");
		WebElement district = driver.findElementByXPath("//*[@id=\"city_distr\"]");
		Select sc4 = new Select(district);
		sc4.selectByIndex(4);
		Thread.sleep(2000);
		
		WebElement frro = driver.findElementById("frrodata");
		Select sc5 = new Select(frro);
		sc5.selectByVisibleText("FRO GUNTUR URBAN");
		
		Thread.sleep(2000);
		WebElement accomodation = driver.findElementById("acco_type");
		Select sc6 = new Select(accomodation);
		sc6.selectByVisibleText("Guest House");
		Thread.sleep(2000);
		
		WebElement grade = driver.findElementById("star_rat");
		Select sc7 = new Select(grade);
		sc7.selectByIndex(5);
		Thread.sleep(2000);
		
		driver.findElementById("email").sendKeys("saikiranjrv@gmail.com");
		driver.findElementById("mcontact").sendKeys("8985891589");
		driver.findElementById("contact").sendKeys("98822338");
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);Thread.sleep(2000);
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[1]/input").sendKeys("saikiran");
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[2]/input").sendKeys("park street");
		WebElement ownersstate = driver.findElementById("state_o");
		Select sc8 = new Select(ownersstate);
		sc8.selectByVisibleText("ANDHRA PRADESH");
		Thread.sleep(2000);
		WebElement ownerdistrict = driver.findElementById("citydistr_o");
		Select sc9 = new Select(ownerdistrict);
		sc9.selectByIndex(5);
		Thread.sleep(2000);
		driver.findElementByName("emailid_o").sendKeys("sai@gmail.com");
		driver.findElementByName("phoneno_o").sendKeys("12356");
		driver.findElementByName("mobile_o").sendKeys("57855");
		driver.findElementByName("add").click();
		
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[1]/input").sendKeys("akhil");
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[2]/input").sendKeys("gandhi street");
		WebElement ownersstate1 = driver.findElementById("state_o");
		Select sc81 = new Select(ownersstate1);
		sc81.selectByIndex(3);
		Thread.sleep(2000);
		WebElement ownerdistrict1 = driver.findElementById("citydistr_o");
		Select sc91 = new Select(ownerdistrict1);
		sc91.selectByIndex(8);
		Thread.sleep(2000);
		driver.findElementByName("emailid_o").sendKeys("akhil@gmail.com");
		driver.findElementByName("phoneno_o").sendKeys("89562578");
		driver.findElementByName("mobile_o").sendKeys("58589589");
		driver.findElementByName("add").click();
			
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[1]/input").sendKeys("akshay");
		driver.findElementByXPath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[29]/td/table[1]/tbody/tr[2]/td[2]/input").sendKeys("nehru street");
		WebElement ownersstate11 = driver.findElementById("state_o");
		Select sc811 = new Select(ownersstate11);
		sc811.selectByIndex(8);
		Thread.sleep(2000);
		WebElement ownerdistrict11 = driver.findElementById("citydistr_o");
		Select sc911 = new Select(ownerdistrict11);
		sc911.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElementByName("emailid_o").sendKeys("akshay@gmail.com");
		driver.findElementByName("phoneno_o").sendKeys("589625821");
		driver.findElementByName("mobile_o").sendKeys("2141256259");
		driver.findElementByName("add").click();
		
		driver.close();
		
	}

}
