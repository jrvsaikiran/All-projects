package weekfour;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FifthTestCase {

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
		driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a/div").click();
		
		Set<String> secondclick = driver.getWindowHandles();
		System.out.println(secondclick);
				for(String click:secondclick)
				{
					driver.switchTo().window(click);
				}
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/homeheader/nav/div/div[3]/a[2]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"LoginFormPopup\"]/app-loginmodal/div/div/div/ul/li[2]/a").click();
		Thread.sleep(3000);
		driver.findElementById("modalLRInput12").sendKeys("saikiranjrv@gmail.com");
		driver.findElementById("modalLRInput13").sendKeys("8985891589");
		driver.findElementByXPath("//*[@id=\"panel8\"]/div[1]/form/div[3]/button").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/input").sendKeys("Guntur");
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/div/ul/li/a/div[1]/label").click();
		
		driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[2]/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[5]/span").click();
		
		driver.findElementByName("dt13").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[5]/span").click();
		driver.findElementByXPath("//*[@id=\"user-data-wrapper-id\"]").click();
		
		WebElement hotelroom = driver.findElementByName("hotelRoom");
		Select sc = new Select(hotelroom);
		sc.selectByIndex(0);
		Thread.sleep(2000);
		
		WebElement hoteladult = driver.findElementByName("hotelAdult");
		Select sc2 = new Select(hoteladult);
		sc2.selectByIndex(2);
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[2]/button").click();
		driver.findElementByXPath("//*[@id=\"TravellerEconomydropdown\"]/div[5]/button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button").click();
		Thread.sleep(3000);
		
		String nameHotel = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3/a").getText();
		System.out.println("hotel name is :" +nameHotel);
		Thread.sleep(3000);
		String price = driver.findElementByXPath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/p").getText();
		System.out.println("price is :-" +price);
		Thread.sleep(3000);
		//driver.findElementByPartialLinkText("Continue to book").click();
		driver.findElementByXPath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/div[4]/button").click();
		Thread.sleep(5000);
		
		WebElement title = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[1]/div/select");
		Select sc3 = new Select(title);
		sc3.selectByIndex(1);
		Thread.sleep(3000);
		
		driver.findElementByName("firstName").sendKeys("saikiran");
		driver.findElementByName("lastName").sendKeys("jakkula");
		
		WebElement state = driver.findElementByName("state");
		Select sc4 =new Select(state);
		sc4.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement gst = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[8]/div/select");
		Select sc5 = new Select(gst);
		sc5.selectByIndex(1);
		Thread.sleep(5000);
		
		driver.findElementByName("companyName").sendKeys("javaselenium");
		driver.findElementByName("companyAddress").sendKeys("hyderabad");
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[12]/button[2]").click();
		Thread.sleep(3000);
		
		//driver.findElementByCssSelector("body > app-root > app-fulllayout > div > app-paxdetail > main > div > div.col-12.col-sm-12.col-md-8.py-2.hotel-Paxdetail-section.Custom_hotel-Paxdetail-section > form > div > div.col-md-12.text-center.my-1 > button.btn.btn-sm.btn-primary-custom.btn-primary.m-0.waves-effect.waves-light.mx-1.font-14").click();
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[9]/button[2]").click();
		Thread.sleep(5000);
		
		/*driver.findElementByPartialLinkText("I Agree with the").click();
		driver.findElementByPartialLinkText("Make Payment").click();*/
		
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-summary/main/div/div[1]/div[6]/label").click();
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-summary/main/div/div[1]/div[7]/button[2]").click();
		Thread.sleep(3000);
		
		String hotelNameCheck = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-summary/main/div/div[2]/div/div/div[1]/span").getText();
		System.out.println("hotel compare is =" +nameHotel+ "and check with this title " +hotelNameCheck);
		Thread.sleep(3000);
		String comparePrice = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-summary/main/div/div[2]/div/div/div[5]/span/b").getText();
		System.out.println( price+ "compare with " +comparePrice);
		Thread.sleep(3000);
	
		
		String gstVerify = driver.findElementByXPath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[9]/div/span").getText();
		System.out.println(gstVerify);
		
		if(gstVerify.contains("Please Enter Valid GST Number"))
		{
			System.out.println("error msg displayed under gst");
		}
		else
		{
			System.out.println("error msg not  displayed under gst");
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
