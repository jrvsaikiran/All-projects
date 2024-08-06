package weekfour;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]").click();
		Thread.sleep(3000);
		driver.findElementById("userName").sendKeys("Ssaikirnn123");
		driver.findElementById("usrPwd").sendKeys("Ss@8985891589");
		driver.findElementById("cnfUsrPwd").sendKeys("Ss@8985891589");
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[3]").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[3]/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("SNUPI");
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		driver.findElementById("firstName").sendKeys("Tjrv");
		driver.findElementById("middleName").sendKeys("sai");
		driver.findElementById("lastname").sendKeys("kiran");
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[3]/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("03-11-1995");
		driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span").click();
		driver.findElementById("email").sendKeys("sai@gmail.com");
		driver.findElementById("mobile").sendKeys("8985891589");
		WebElement country = driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select");
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		driver.findElementByName("resAddress1").sendKeys("5253");
		driver.findElementByName("resAddress2").sendKeys("park");
		driver.findElementByName("resAddress3").sendKeys("sattenapalli");
		driver.findElementByName("resPinCode").sendKeys("522403");
		Thread.sleep(1000);
		driver.findElementById("resState").click();
		Thread.sleep(1000);
		WebElement city = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select");
		Select cit = new Select(city);
		cit.selectByIndex(1);
		Thread.sleep(3000);
		WebElement po = driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select");
		Select se = new Select(po);
		se.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElementById("resPhone").sendKeys("8985891589");
		driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]").click();
		driver.findElementByName("offAddress1").sendKeys("455");
		driver.findElementByName("offAddress2").sendKeys("gandhi");
		driver.findElementByName("offAddress3").sendKeys("Guntur");
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[3]/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li").click();
		driver.findElementById("offPinCode").sendKeys("522403");
		driver.findElementById("offState").sendKeys("ANDHRA PRADESH");
		driver.findElementById("offCity").sendKeys("GUNTUR");
		driver.findElementById("offPostOff").sendKeys("GUNTUR");
		driver.findElementById("offPhone").sendKeys("8985891589");
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]").click();
		driver.quit();
		
	}

}
