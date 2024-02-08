package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/Customer.feature",
				glue = "stepdefinition",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty","html:target/result.html"} )
				

public class TestRunner {

	
}
