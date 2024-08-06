package allweeks;

import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.youtube.com/");

}
}
