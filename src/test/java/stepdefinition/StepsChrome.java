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
Datas datas=new Datas();


	@Given("^The http://automationpractice\\.com/index\\.php website is openChrome$")
	public void the_http_automationpractice_com_index_php_website_is_openIE() throws InterruptedException  {
		datas.initializeChromeDriver(datas.driver);	    
	}

	@When("^User clicks on the Sign Up buttonChrome$")
	public void user_clicks_on_the_Sign_Up_buttonIE()  {
		datas.clickOnButton(datas.driver);
	    
	}

	@When("^User provides wrong email and/or passwordChrome$")
	public void user_provides_wrong_email_and_or_passwordIE() throws InterruptedException  {
		datas.fillLoginDatas(datas.driver, "randomLogin", "randomPassword");
		datas.clickOnSubmit(datas.driver);
	    datas.singleSleep(datas.driver);
	   
	}

	@Then("^Login will failChrome$")
	public void login_will_failIE() {
		System.out.println(datas.driver.findElement(By.xpath("//div[contains(@class,'alert')]//p")).isDisplayed()+"on Chrome");
	   datas.driver.quit();	
	}
	
	
}
