package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		tags={"@Cart"},
		glue={"driversIni","stepDefinitions"}
		)

public class addToCartTest {

}
