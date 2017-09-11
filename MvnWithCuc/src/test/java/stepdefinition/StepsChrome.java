package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import datas.Datas;

public class StepsChrome {
static WebDriver driver;
	@Given("^The http://automationpractice\\.com/index\\.php website is openChrome$")
	public void the_http_automationpractice_com_index_php_website_is_openIE() throws InterruptedException  {
		String baseUrl="http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "C:\\kgruza\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);
	    
	}

	@When("^User clicks on the Sign Up buttonChrome$")
	public void user_clicks_on_the_Sign_Up_buttonIE()  {
		Datas.clickOnButton(driver);
	    
	}

	@When("^User provides wrong email and/or passwordChrome$")
	public void user_provides_wrong_email_and_or_passwordIE() throws InterruptedException  {
		Datas.fillEmail(driver, "cokolwiek");
		Datas.fillPassword(driver, "cokolwiek2");
		Datas.clickOnSubmit(driver);
	    Datas.singleSleep(driver);
	   
	}

	@Then("^Login will failChrome$")
	public void login_will_failIE() {
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert')]//p")).isDisplayed()+"on Chrome");
	   driver.quit();	
	}
	
	
}
