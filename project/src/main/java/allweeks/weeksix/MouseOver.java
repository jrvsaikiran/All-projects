package weeksix;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		Thread.sleep(3000);
		Actions builder =new Actions(driver);		
		WebElement holidays = driver.findElementByLinkText("HOLIDAYS");
		builder.moveToElement(holidays).perform();
	
		driver.navigate().refresh();
		driver.findElementByXPath("").sendKeys(Keys.ALT);
		//	for more than one action
		//builder.click(holidays).clickAndHold(holidays).contextClick(holidays).build().perform();
	}

}
