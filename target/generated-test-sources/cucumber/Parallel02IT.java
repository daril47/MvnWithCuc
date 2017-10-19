import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features/ProductToCart.feature"},
    format = {"json:target/cucumber-parallel/2.json", "html:target/cucumber-parallel/2.html", "rerun:target/cucumber-parallel/2.rerun", "pretty"},
    monochrome = true,
    tags = {"@LoginFirefox", "@LoginChrome","@CartFirefox","@CartChrome"},
    glue = { "stepdefinition" })
public class Parallel02IT {
}