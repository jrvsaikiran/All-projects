package weekone.weektwo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.lang.reflect.Method;
import java.sql.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Theory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// driver methods
		driver.manage().window().maximize();
		driver.get(""); // load url
		driver.getCurrentUrl(); // get url
		driver.getTitle(); // title of window broswer
		driver.close(); // close current windoe
		driver.quit(); // close all windows

		// navigation
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().to("");
		driver.navigate().refresh();
		// =====================================================================
		// Wait properties
		// implicity wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// explicity wait
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = driver.findElement(By.xpath(""));
		By elementBy = By.xpath("");
		wait.until(ExpectedConditions.elementToBeClickable(element));

		// fluentw wait
		FluentWait<WebDriver> flue = new FluentWait<WebDriver>(driver);
		flue.withTimeout(Duration.ofMillis(9000));
		flue.pollingEvery(Duration.ofMillis(1000));
		flue.ignoring(NoSuchElementException.class);
		flue.until(ExpectedConditions.elementToBeSelected(element)); // used in naga

		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(element)).isEnabled();
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(element)).sendKeys("");
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(element))
				.getAttribute("value");
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOf(element)); // wait untill
																									// element is
																									// visible
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.invisibilityOf(element)); // wait untill
																										// element is
																										// not visible
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
		wait.pollingEvery(Duration.ofMillis(2000)).until(ExpectedConditions.visibilityOfElementLocated(elementBy));
		// =========================================
		// web element methods
		element.sendKeys(Keys.TAB);
		element.sendKeys(Keys.PAGE_DOWN);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		element.clear();
		element.click();
		element.getAttribute("value");
		element.getText();
		element.getSize();
		element.isSelected();
		element.isEnabled();
		element.isDisplayed();
		element.toString();
		element.getSize();
		element.getSize().getHeight();
		element.getSize().getWidth();
		// ==========================================
		// select class
		Select sc = new Select(element);
		sc.selectByIndex(6);
		sc.selectByValue("");
		sc.selectByVisibleText("");

		// verifyOptionIsSelectedByValueFromDropDown - Retrieve the list options
		// selected
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement option : allSelectedOptions) {
			if (option.getText().equalsIgnoreCase("expected option")) {
				break;
			}
		}
		// getting the list of options in the dropdown with getOptions() - verify option
		// present in dropdown or not
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equalsIgnoreCase("expected option")) {
				break;
			}
		}

		// ==================================================
		// Action class
		Actions ac = new Actions(driver);
		ac.doubleClick().perform();
		ac.contextClick().doubleClick(element).build().perform(); // more than one action use build()
		ac.moveToElement(element).build().perform();
		ac.moveToElement(element).doubleClick(element).build().perform(); // userd in naga project
		ac.contextClick(element); // right click
		ac.moveToElement(element).moveToElement(element).click().build().perform(); // naga
		ac.doubleClick(element).build().perform(); // naga
		// ==================================
		// javascript executor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// click a button
		js.executeScript("document.getElementByID('username').click();");
		js.executeScript("arguments[0].click();", element);

		// send text
		js.executeScript("document.getElementByID('username').value='kiran';");
		js.executeScript("arguments[0].value='jrv';", element);

		// get text
		js.executeScript("document.getElementByID('username').value");

		// scroll down
		js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollBy(0,600)", ""); // naga scroll to specific point

		// refresh the browser window
		js.executeScript("location.reload()");

		// interact with checkbox
		js.executeScript("document.getElementByID('username').checked=false;");

		// launch new url
		js.executeScript("window.location = 'https://demo.guru99.com/'");

		// to wait for 5 seconds
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		// To generate Alert window using JavascriptExecutor. Display the alert message
		js.executeScript("alert('Welcome to Guru99');");

		// wait for page load
		js.executeScript("return indow.stop");
		// ==========================================================
		// Assertions soft and hard
		boolean status = true;
		Assert.assertEquals("expecteds", "actual");
		Assert.assertNotEquals("unexpected", "actual");
		Assert.assertFalse(status);
		Assert.assertNull(status);
		Assert.assertNotNull(element); // element not present in page

		// Create object / instance of Hard / Soft assert:
		// hard assert
		Assertion hardAssert = new Assertion();
		hardAssert.assertEquals("actual", "expected");
		hardAssert.assertNotEquals("actual", "expected");
		hardAssert.assertTrue(status);

		// soft assert
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
		softAssert.assertEquals("actual", "expected");
		softAssert.assertNotEquals("actual", "expected");
		// =============================================================
		// window handles
		String currentHandle = driver.getWindowHandle(); // return single window id
		// switch to window by string
		Set<String> windowHandles = driver.getWindowHandles(); // return all windows id's
		for (String handle : windowHandles) {
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase("actual title")) {
				break;
			}
		}

		// switch to window by index
		int stopAt = 2;
		int count = 0;
		Set<String> allWin = driver.getWindowHandles();
		Iterator<String> iterator = allWin.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			count++;
			if (count == stopAt) {
				driver.switchTo().window(next);
				break;
			}

		}

		// close window by index
		int stopAT = 4;
		int count1 = 1;
		Set<String> windowHandles2 = driver.getWindowHandles();
		Iterator<String> iterator2 = windowHandles2.iterator();
		while (iterator2.hasNext()) {
			String next = iterator2.next();
			count1++;
			if (count1 == stopAT) {
				driver.switchTo().window(next);
				driver.close(); // close current window
				break;
			}
		}

		// ======================================================
		// Alert methods
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.hashCode();

		// frame methods
		driver.switchTo().frame(6); // by index
		driver.switchTo().frame(""); // by string
		driver.switchTo().frame(element); // by webelement
		driver.switchTo().defaultContent(); // back to main frame

		// ==========================================================
		// screenshot take snap
		int snapNumber = 0;
		try {
			File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./reports/screenshots/" + snapNumber + ".png");
			FileUtils.copyFile(screenshotAs, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//==================================
		//File upload by robot class		
		try {
			Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection str = new StringSelection("./doc/jrv.docx");
			clip.setContents(str, null);
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);			
		} catch (AWTException e1) {
			
		}
		
		// ==========================
		// Exceptions
		try {
			System.out.println("Exceptions");

		} catch (NoSuchElementException e) { // element not visible in dom

		} catch (ElementNotVisibleException e) { // not visible

		} catch (ElementClickInterceptedException e) { // not able to click

		} catch (ElementNotInteractableException e) { // not able to interact

		} catch (ElementNotSelectableException e) { // for select class

		} catch (StaleElementReferenceException e) { // element sometimes present sometimes not present

		} catch (UnhandledAlertException e) { // not expecting alert but alert present

		} catch (NoAlertPresentException e) { // alert not present

		} catch (NoSuchFrameException e) { // frame not available

		} catch (NoSuchWindowException e) { // window not available

		} catch (SessionNotCreatedException e) { // session not created

		} catch (WebDriverException e) { // selenium e

		} catch (Throwable e) { // java e

		} finally {

		}

		// =======================================
		// //relative xpaths
		// //input[@name='pan_middlename'] 				normal
		// //input[contains(@id,'pan_firstname')] 		contains
		// //span[starts-with(text(),'India')] 			starts-with

		// //button[text()='OK'] 							text
		// (//a[starts-with(text(),'Sign)')]) 			text-startsWith
		// (//a[contains(text(),'Sign)')]) 				test-contains
		// (//input[@type='text'])[9] 					indexing

		// //input[@name='email']/following::input 		following
		// //div[@class='hotel-l']/preceding::h5 		preceding

		//below both for to parent naviagtion
		// //input[@name='pan_middlename']/..
		// //input[@name='pan_middlename']/parent::span
		
		//siblings
		// //input[@name='email']/following-sibiling::input 	
		// //div[@class='hotel-l']/preceding-sibliing::h5 		
		//==============================================
		
		//Testng suites
		/*
		 * @BeforeSuite
		 *@BeforeTest
		 *@BeforeClass
		 *@BeforeMethod
		 *@Test
		 *@AfterMethod
		 *@AfterClass
		 *@AfterTest
		 *@AfterSuite
		 *
		 **/
		//==========================
		
		//Git commands
		/*
		 * git clone -b <branchname> <git url>
		 * git config --global user.name "jakkularajaven1"
		 * git status
		 * git branch
		 * git stash
		 * git fetch
		 * git checkout <branchname>	to change
		 * git checkout -b <branchname>  to create
		 * git commit -m "comments"
		 * git push origin <branch name>
		 * git clean -f -x
		
		//maven commands
		 * mvn clean install
		 * mvn dependency:copy-dependencies
		 * mvn eclipse:eclipse
		 * mvn dependency:resolve	
		 * mvn clean install -Dxmlfilename="" -Dusername="" -Dpassword="" ----mvn commend to run
		 
		//versions
		 * postman-7.6.0
		 * git-2.21.0
		 * maven-3.6.1
		 * JDK-1.8.0_161
		 * Eclipse-4.12.0
		 * Heidi SQL-9.5.0.5196
		 * TestNg-7.4.0
		 * Apache.poi-4.1.2
		 * Selenium-java-3.141.59
		 * ExtentReport-2.41.1
		 * IO-RestAssured-4.4.0
		 * Jackson-databind-2.3.1
		 * oracle-database-21.7.0.0
		 * Gherkin-5.1.0
		 * Cucumber-Testng-5.7.0
		 * WebDriverManager-5.1.0
		 * Cucumber-7.0.0
		 * Junit-5.8.1
		*/
		//=================================
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.setAcceptInsecureCerts(true); 
		chromeOptions.addArguments("--disable-web-security"); 
		chromeOptions.addArguments("--ignore-urlfetcher-cert-requests"); 
		chromeOptions.addArguments("--disable-renderer-backgrounding");
		chromeOptions.addArguments("--disable-infobars"); 
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems 
		chromeOptions.addArguments("--no-sandbox"); // Bypass 0S security model 
		chromeOptions.addArguments("window-size=1200,800");
		chromeOptions.addArguments("force-device-scale-factor=0.85"); 
		chromeOptions.addArguments("high-dpi-support=0.85");

//	=============================================================================
// xml suite

	/*<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
		<suite name="SeleniumSuite">
    		<test name="SeleniumTest">
      		  <classes>
           		 <class name="your.package.YourTestClass1" />
          		 <class name="your.package.YourTestClass2" />
           		 <!-- Add more test classes as needed -->
      		  </classes>
   		 	</test>
    		<!-- Add more <test> elements for additional test configurations if necessary-->
		</suite>
*/





//==========================================================================================
	}
	public static void dbConnectionSettings() {
		// Database connection parameters
		String url = "jdbc:mysql://localhost:3306/your_database";
		String username = "your_username";
		String password = "your_password";

		// Establishing the connection
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			// Creating a statement
			Statement statement = connection.createStatement();

			// Example query
			String query = "SELECT * FROM your_table";
			ResultSet resultSet = statement.executeQuery(query);

			// Process the result set
			while (resultSet.next()) {
				// Retrieve data from the result set
				String column1 = resultSet.getString("column_name1");
				String column2 = resultSet.getString("column_name2");

				// Process the data as needed
				System.out.println("Column1: " + column1 + ", Column2: " + column2);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//=================================================================================
	@DataProvider(name="testdata")
	public static Object[][] pub(Method m) {
		String[][] testdata = new String[0][];
		String sheetname = m.getName();
		try {
			FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetname);
			int lastRowNum = sheet.getLastRowNum();
			int lastCellNum = sheet.getRow(0).getLastCellNum();
			System.out.println("Row Count "+lastRowNum);
			System.out.println("Column Count "+lastCellNum);

			testdata = new String[lastRowNum][lastCellNum];
			DataFormatter formate = new DataFormatter();
			for(int i=1;i<=lastRowNum;i++) {
				for(int j=0;j<lastCellNum;j++) {
					testdata[i-1][j] = formate.formatCellValue(sheet.getRow(i).getCell(j));
					System.out.println("The value of row "+(i-1)+" and column "+j+" is : "+testdata[i-1][j]);
				}
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		System.out.println(testdata);
		return testdata;
	}

	@Test(enabled=false,dataProvider="testdata",dataProviderClass= Theory.class)
	public void facebook(String username,String password) throws Exception {

	}
//===========================================================================

	public static void writeToExcelSheet() {
		try (Workbook workbook = new XSSFWorkbook()) {
			Sheet sheet = workbook.createSheet("Sheet1");

			// Creating a row and cells
			Row headerRow = sheet.createRow(0);
			Cell headerCell = headerRow.createCell(0);
			headerCell.setCellValue("Hello");

			// Writing to the Excel file
			try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) {
				workbook.write(fileOut);
			}
		} catch (IOException e) {
			e.printStackTrace();
 }
}

//===============================================================
}
