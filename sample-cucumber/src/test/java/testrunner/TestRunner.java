package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/AppFeature/testsample.feature",glue = "stepdefinition",dryRun = true,monochrome = true,
		plugin = {"pretty","html:target/result.html"} )
				

public class TestRunner {

	
}
