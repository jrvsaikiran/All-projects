package weekfour;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdTestCase {

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
			
		}
		
		driver.findElementById("sidebarCollapse").click();
		driver.findElementByPartialLinkText("Charter").click();
		driver.findElementByXPath("//*[@id=\"dismiss\"]").click();
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Enquiry Form").click();
		Thread.sleep(3000);
		driver.findElementByName("name").sendKeys("kiran");
		driver.findElementByName("organization").sendKeys("selenium");
		driver.findElementByName("address").sendKeys("park");
		driver.findElementByName("mobile").sendKeys("8985891589");
		driver.findElementByName("email").sendKeys("kiran@gmail.com");
		
		WebElement request = driver.findElementByName("requestFor");
		Select sc = new Select(request);
		sc.selectByIndex(1);
		
		driver.findElementByName("originStation").sendKeys("javaltp");
		driver.findElementByName("destnStation").sendKeys("selenium");
		driver.findElementByName("checkInDate").click();
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[2]/td[6]/span").click();
		driver.findElementByName("checkOutDate").click();
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/input").click();
		driver.findElementByName("durationPeriod").sendKeys("2");
		driver.findElementByName("coachDetails").sendKeys("good and neet");
		
		driver.findElementByName("numPassenger").sendKeys("20");
		driver.findElementByName("charterPurpose").sendKeys("trip to goa");
		driver.findElementByName("services").sendKeys("services");
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
		
		String checkMob = driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[4]/input").getText();
		if(checkMob.contains("Mobile no not valid."))
		{
			System.out.println("Mobile no not valid  is displayed below Mobile filed.");
		}
		else
		{
			System.out.println("Mobile no not valid  is not displayed below Mobile filed.");
		}
		
		
		driver.quit();
		
	}

}
