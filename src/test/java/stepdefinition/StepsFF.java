package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import datas.Datas;
import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsFF extends Datas {

	WebDriver driver;
	Datas datas = new Datas();

	@Given("^The http://automationpractice\\.com/index\\.php website is open$")
	public void the_http_automationpractice_com_index_php_website_is_open() throws InterruptedException {
		datas.initializeFirefoxDriver(datas.driver);
		Thread.sleep(2000);
	}

	@When("^User clicks on the Sign Up button$")
	public void user_clicks_on_the_Sign_Up_button() {

//		datas.clickOnSignInButton(datas.driver);
				datas.clickOnButton(datas.driver);
	}

	@When("^User provides wrong email and/or password$")
	public void user_provides_wrong_email_and_or_password() throws InterruptedException {
		datas.fillLoginDatas(datas.driver, "randomLogin", "randomPassword");
		datas.clickOnSubmit(datas.driver);
		datas.singleSleep(datas.driver);

	}

	@Then("^Login will fail$")
	public void login_will_fail() {

		System.out.println(datas.driver.findElement(By.xpath("//div[contains(@class,'alert')]//p")).isDisplayed());
		datas.driver.quit();

	}

}