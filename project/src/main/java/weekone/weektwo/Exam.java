package weekone.weektwo;


//import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import weekone.weektwo.DataProviderExam;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class Exam extends DataProviderExam{

	public  RemoteWebDriver driver ;


	static By header_tbl = By.xpath("//*[@id='table02']/thead/tr");	//*[@id='table02']/thead/tr/th
	By body_tbl = By.xpath("//*[@id='table02']/tbody");		// //*[@id='table02']/tbody/tr[1]/td[3]

	public   ArrayList<String> column;

	public List<String> columnNames ;
	
	@Test(enabled=false)
	public  void ReadRecordsTable()  {
		List<Map<String, String>> recordList = new ArrayList<>();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		//get all columns
		columnNames = columns(header_tbl);
		System.out.println("----column name----"+columnNames);	
		
		//get all row fields
		List<WebElement> rowElementList = driver.findElement(body_tbl).findElements(By.tagName("tr"));
		for(int i=0;i<rowElementList.size();i++) {
			Map<String, String> rowData = getRowData(rowElementList.get(i));
			recordList.add(rowData);
		}
		System.out.println("====record-1==="+recordList.get(1));
		System.out.println("====record==="+recordList);
		driver.quit();
	}
	
	
	
	private Map<String, String> getRowData(WebElement webElement) {
		Map<String, String> rowFieldMap = new LinkedHashMap<String, String>();
		List<WebElement> rowElements = webElement.findElements(By.tagName("td"));
		for(int i=0;i<columnNames.size();i++) {
			rowFieldMap.put(columnNames.get(i), rowElements.get(i).getText().trim());
		}
		System.out.println("--map=---"+rowFieldMap);
		return rowFieldMap;
	}



	public  List<String> columns (By locator) {
		List<String> clmNames = new ArrayList<>();
		List<WebElement> tag = driver.findElement(locator).findElements(By.tagName("th"));
		for(int i=0;i<tag.size();i++) {
			String trim = tag.get(i).getText().trim();
			clmNames.add(trim);				
		}	
		return clmNames;
	}

	
	@Test(enabled=false,dataProvider="testdata",dataProviderClass= DataProviderExam.class)
	public void facebook(String username,String password) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test(enabled=true,dataProvider="testdataMap",dataProviderClass=DataProviderExam.class)
	public void fbNaga() throws Exception {
		String username = null,password = null;
		List<Map<Object, Object>> list = DataProviderExam.getExcelTable();
		System.out.println("==========list======"+list);
		getExcelTable();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	

	
	
	
	
	
	
	}
	
		
