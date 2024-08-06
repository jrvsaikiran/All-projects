package weekfour;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.struc.Stack;

public class SecondTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]").click();
		//driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]").click();
		driver.findElementByPartialLinkText("Lounge").click();
		
		Set<String> afterclick = driver.getWindowHandles();
		System.out.println(afterclick);
		
		for(String eachid : afterclick)
		{
			driver.switchTo().window(eachid);
			String title = driver.getTitle();
			if(title.equals("Railways Tourism, Retiring Rooms, Holidays Customized Tours, LTC Tours, Maharajas, Mahaparinirvan"))
					
					{
				break;
					}               
		}
		
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"sidebarCollapse\"]/i").click();
		driver.findElementByPartialLinkText("Book Your Coach/Train").click();
		
		Set<String> aftersecondclick = driver.getWindowHandles();
		System.out.println(aftersecondclick);
		
		for(String eachid2:aftersecondclick)
		{
			driver.switchTo().window(eachid2);
			String title2 = driver.getTitle();
			if(title2.equals("IRCTC FTR SERVICE "))
			{
				break;
			}
		}
		
		
		driver.findElementByPartialLinkText("New User? Signup").click();
		driver.findElementById("userId").sendKeys("Ss_898saikiran");
		driver.findElementById("password").sendKeys("Ss8985891589");
		driver.findElementById("cnfPassword").sendKeys("Ss8985891589");
		
		WebElement sequrityquestion = driver.findElementById("secQstn");
		Select sc1 = new Select(sequrityquestion);
		sc1.selectByValue("6");
		Thread.sleep(2000);
		
		driver.findElementById("secAnswer").sendKeys("hero");
		driver.findElementById("dateOfBirth").click();
		driver.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a").click();
		driver.findElementById("gender0").click();
		driver.findElementById("maritalStatus1").click();
		driver.findElementById("email").sendKeys("kiran@gmail.com");
		
		WebElement occupation = driver.findElementById("occupation");
		Select sc2 = new Select(occupation);
		sc2.selectByVisibleText("Self Employed");
		
		driver.findElementById("fname").sendKeys("kiran");
		driver.findElementById("mname").sendKeys("sai");
		driver.findElementById("lname").sendKeys("jrv");
		
		WebElement nation = driver.findElementById("natinality");
		Select sc3 = new Select(nation);
		sc3.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementById("flatNo").sendKeys("102");
		driver.findElementById("street").sendKeys("park");
		driver.findElementById("area").sendKeys("chitambaram");
		
		WebElement country = driver.findElementById("country");
		Select sc4 =new Select(country);
		sc4.selectByValue("94");
		Thread.sleep(2000);
		
		driver.findElementById("mobile").sendKeys("8985891589");
		driver.findElementById("pincode").sendKeys("522403");
		Thread.sleep(3000);
		
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		WebElement postdrop=driver.findElementById("postOffice");
		Select sc41=new Select(postdrop);
		sc41.selectByIndex(4);
		driver.findElementByXPath("//*[@id=\"sameAddresses1\"]").click();
		driver.findElementById("flatNoOffice").sendKeys("2561");
		driver.findElementById("streetOffice").sendKeys("office Street");
		driver.findElementById("areaOffice").sendKeys("Sattenappli");
		WebElement coun1drop=driver.findElementById("countryOffice");
		Select sc5=new Select(coun1drop);
		sc5.selectByIndex(1);
		driver.findElementById("mobileOffice").sendKeys("8985891589");
		driver.findElementById("pincodeOffice").sendKeys("522403");
		Thread.sleep(3000);
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		WebElement postdrop1=driver.findElementById("postOfficeOffice");
		Select sc6=new Select(postdrop1);
		sc6.selectByIndex(4);
		driver.quit();
		
		
	}

}
