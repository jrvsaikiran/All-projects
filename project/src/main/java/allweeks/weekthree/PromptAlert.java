package weekthree;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().sendKeys("kiran");
				
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		String name = driver.findElementById("demo").getText();
		
		System.out.println(name);
		
		if(name.equals("Hello kiran! How are you today?"))
				{
					System.out.println("you entered name is kiran");
				}
		else
		{
			System.out.println("you entered cancle");
		}
		
		
		
		
		driver.navigate().refresh();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().sendKeys("J R V SAI KIRAN");
		
		String text2 = driver.switchTo().alert().getText();
		
		System.out.println(text2);
		
		driver.switchTo().alert().accept();
		
		String name2 = driver.findElementById("demo").getText();		
		
		System.out.println(name2);
		
		if(name2.equals("Hello J R V SAI KIRAN! How are you today?"))
		{
			System.out.println("you entered name is kiran");
		}
		else
		{
			System.out.println("you entered cancle");
		}
		
		
		driver.navigate().refresh();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("/html/body/button").click();
		
		String text3 = driver.switchTo().alert().getText();
				
		System.out.println(text3);
		
		driver.switchTo().alert().sendKeys("kiran");
		driver.switchTo().alert().dismiss();
		
		String name3 = driver.findElementById("demo").getText();
		
		
		
		
		System.out.println(name3);
		
		if(name3.equals("Hello kiran! How are you today?"))
		{
			System.out.println("you entered name");
		}
		else
		{
			System.out.println("you pressed cancle");
		}
		

		driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();
		
		
	}

}
