package tests.MvnCuc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features",
		tags={"@LoginFirefox"},
		 glue={"stepdefinition"}
		
		)
public class FFLoginAT {
	
}
	