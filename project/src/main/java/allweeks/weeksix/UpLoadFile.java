package weeksix;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.findElementById("wdgt-file-upload").click();
		Thread.sleep(3000);
		
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection("D:\\java classes\\New folder\\kiran resume.docx");
		clip.setContents(str, null);
		Thread.sleep(5000);
		
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
