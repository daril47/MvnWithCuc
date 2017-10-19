import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features/loginTest.feature"},
    format = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "rerun:target/cucumber-parallel/1.rerun", "pretty"},
    monochrome = true,
    tags = {"@LoginFirefox", "@LoginChrome","@CartFirefox","@CartChrome"},
    glue = { "stepdefinition" })
public class Parallel01IT {
}