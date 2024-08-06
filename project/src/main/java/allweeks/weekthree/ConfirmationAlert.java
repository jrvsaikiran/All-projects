package weekthree;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Thread.sleep(3000);
		
		WebDriver div = driver.switchTo().frame("iframeResult");
		
		System.out.println(div.getTitle());
		
		driver.findElementByXPath("/html/body/button").click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		
		System.out.println(confirmationAlert.getText());
		
		//Thread.sleep(1000);
		confirmationAlert.accept();
		
		String alertMsg = driver.findElementById("demo").getText();
		
		System.out.println(alertMsg);
		
		if(alertMsg.contains("OK"))
		{
			System.out.println("ok is printed");
		}
		else
		{
			System.out.println("cancle is printe");
		}
		
		
				
		driver.navigate().refresh();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		Alert conformationAlert = driver.switchTo().alert();
		
		System.out.println(conformationAlert.getText());
		
		conformationAlert.accept();
		
		String alertMsg2 = driver.findElementById("demo").getText();
		
		System.out.println(alertMsg2);
		
		if(alertMsg2.contains("OK"))
		{
			System.out.println("ok is printed");
		}
		else
		{
			System.out.println("cancle is printe");
		}
		
		
		
		
		
		
		
		
		driver.navigate().refresh();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		Alert conformationAlert3 = driver.switchTo().alert();
		
		System.out.println(conformationAlert3.getText());
		
		conformationAlert3.dismiss();
		
		String alertMsg3 = driver.findElementById("demo").getText();
		
		System.out.println(alertMsg3);	
		
		
		
		if(alertMsg3.contains("OK"))
		{
			System.out.println("ok is printed");
		}
		else
		{
			System.out.println(" cancle is printed");
		}
		
		
	
		driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();		
		
		
	}

}
