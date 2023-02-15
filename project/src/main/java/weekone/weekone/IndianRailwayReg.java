package weekone;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndianRailwayReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in");

		driver.findElementByXPath(
				"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")
				.click();

		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]").click();

		Thread.sleep(2000);
		driver.findElementById("userName").sendKeys("jrv948");

		driver.findElementById("usrPwd").sendKeys("Ss@8985891589");

		driver.findElementById("cnfUsrPwd").sendKeys("Ss@8985891589");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("bharath");

		driver.findElementByXPath(
				"//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();

		driver.findElementById("firstName").sendKeys("jrvsaikiran");

		driver.findElementById("middleName").sendKeys("sai");

		driver.findElementById("lastname").sendKeys("kiran");

		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").sendKeys("0311995");

		driver.findElementByXPath("//*[@id=\"unmarried\"]/div/div[2]").click();

		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span").click();
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		driver.findElementById("email").sendKeys("saikiranjrv@gmail.com");

		driver.findElementById("mobile").sendKeys("8985891589");

		driver.findElementByXPath(
				"//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();

		driver.findElementById("resAddress1").sendKeys("park road");

		driver.findElementById("resAddress2").sendKeys("sattenapalli");

		driver.findElementById("resAddress3").sendKeys("water tank");

		driver.findElementByName("resPinCode").sendKeys("522403");

		driver.findElementById("resState").sendKeys("andhrapradesh");

		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);

		driver.findElementById("resPhone").sendKeys("8985891589");

		// driver.findElementByXPath("//*[@id=\"yes\"]/div/div[2]/span").click(); //for
		// yes
		driver.findElementByXPath("//*[@id=\"no\"]/div/div[2]/span").click();

		driver.findElementById("offAddress1").sendKeys("park street");

		driver.findElementById("offAddress2").sendKeys("near water tank");

		driver.findElementById("offAddress3").sendKeys("vaddavalli");

		driver.findElementById("offPinCode").sendKeys("603203");
		driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);

		// driver.findElementByXPath("//*[@id=\"offState\"]").sendKeys("tamilnadu");
		driver.findElementById("offState").sendKeys("tamilnadu");

		// driver.findElementById("offPhone").sendKeys("988022338");
		// driver.findElementByXPath("//*[@id=\"offPhone\"]").sendKeys("8985891589");
		driver.findElementByName("offPhone").sendKeys("8985589855");

		// driver.findElementByXPath("//*[@id=\"recaptcha-anchor\"]/div[1]").click();

		// driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input").click();

	}

}
