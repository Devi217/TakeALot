package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/"},
		glue = {"stepdefinitions", "AppHooks"},
				dryRun = false,
			    strict = true,
			    monochrome = true,
			  //  plugin = { "progress" }		    	
			 
				plugin = {"pretty"
					//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						//"timeline:test-output-thread/"
						
			}
		
		)

public class MyTestRunner {

}
