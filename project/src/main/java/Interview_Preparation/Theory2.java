package Interview_Preparation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Theory2 {

    public static void main(String[] args) {
        //how to handle hidden drop downs
        WebDriver driver = new ChromeDriver();
        WebElement dropdown = driver.findElement(By.id("ID_OF_DROPDOWN"));  // Locate the hidden drop-down

        // Use JavaScript to make the drop-down visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='block';", dropdown);

        // Now you can interact with the drop-down
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//option[@value='VALUE_YOU_WANT_TO_SELECT']"));
        option.click();
    }

//    ====================end===========================

    //calling RetryAnalyzer class to test level
    /*@Test(retryAnalyzer =Theory2.class )
    public void retryTest(){
    }*/

    //to run failure test cases in testng
    public class RetryAnalyzer implements IRetryAnalyzer {
        private int retryCount = 0;
        private static final int maxRetryCount = 3; // Maximum retry count

        @Override
        public boolean retry(ITestResult result) {
            if (retryCount < maxRetryCount) {
                retryCount++;
                return true;
            }
            return false;
        }
    }

    //to run failure test cases in bdd cucumber
    public void runnerfileBdd(){
        @RunWith(Cucumber.class)
        @CucumberOptions(
                features = "src/test/resources/features",
                glue = {"stepDefinitions"},
                dryRun = true,
                tags = "sanity",
                plugin = {"pretty", "rerun:target/rerun.txt"} //failed test case will store in .txt file
        )
        class TestRunner{
        }
    }

    public void runFaildTestCaseBdd(){
        @RunWith(Cucumber.class)
        @CucumberOptions(
                features = "@target/rerun.txt", //running fail cases which are in .txt file
                glue = {"stepDefinitions"},
                plugin = {"pretty"},
                dryRun = true,
                tags = "sanity"
        )
         class FailedTestRunner{
        }

    }
}
