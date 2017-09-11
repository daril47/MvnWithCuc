package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import datas.Datas;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepsFF   {

	static WebDriver driver;
	Datas datas=new Datas();
	@Given("^The http://automationpractice\\.com/index\\.php website is open$")
	public void the_http_automationpractice_com_index_php_website_is_open() throws InterruptedException  {
	
		datas.initializeFirefoxDriver(driver);
	
	   }

	@When("^User clicks on the Sign Up button$")
	public void user_clicks_on_the_Sign_Up_button()  {
		Datas.clickOnButton(driver);
		}

	@When("^User provides wrong email and/or password$")
	public void user_provides_wrong_email_and_or_password() throws InterruptedException  {
		Datas.fillEmail(driver, "cokolwiek");
		Datas.fillPassword(driver, "cokolwiek2");
		Datas.clickOnSubmit(driver);
	    Datas.singleSleep(driver);
	    
	}

	@Then("^Login will fail$")
	public void login_will_fail()  {
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert')]//p")).isDisplayed());
	   driver.quit();
	    
	}

}