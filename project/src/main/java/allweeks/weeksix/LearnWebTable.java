package weeksix;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//input[@id='buttonFromTo']").click();
		Thread.sleep(3000);
		
		List<WebElement> allElements =  driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr");
		
		for(int i=1;i<=allElements.size();i++) {
			
			
		if(i!=16) {	
			List<WebElement> allColumElements = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td");
			
			for(int j=1;j<allColumElements.size();j++) {
				
				
				String trainData = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td["+j+"]").getText();
				
				System.out.println(trainData);
			
		String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]/a").getText();
		
		//System.out.println(trainName);
		if(trainName.equals("ERS DURONTO SPL")) {
			driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']/tbody/tr["+i+"]/td[2]/a").click();
		
		
			
		}
		
		
		
		
		
		
		
		}
		}
		
		}
		
		
		
		
		
		
		
		
	}

}
