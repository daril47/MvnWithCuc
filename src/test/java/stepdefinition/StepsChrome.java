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
import datas.LoginDatas;

public class StepsChrome {
	WebDriver driver;
	LoginDatas ObjLoginDatasChrome=new LoginDatas(driver);


	@Given("^The http://automationpractice\\.com/index\\.php website is openChrome$")
	public void the_http_automationpractice_com_index_php_website_is_openIE() throws InterruptedException  {
		ObjLoginDatasChrome.initializeChromeDriver(driver);	    
	}

	@When("^User clicks on the Sign Up buttonChrome$")
	public void user_clicks_on_the_Sign_Up_buttonIE()  {
		ObjLoginDatasChrome.clickOnSignInButton();
	    
	}

	@When("^User provides wrong email and/or passwordChrome$")
	public void user_provides_wrong_email_and_or_passwordIE() throws InterruptedException  {
		ObjLoginDatasChrome.setLoginDatas( "randomLogin", "randomPassword");
		ObjLoginDatasChrome.clickOnSubmitButton();
			   
	}

	@Then("^Login will failChrome$")
	public void login_will_failIE() {
		ObjLoginDatasChrome.loginFailureCheck();
		ObjLoginDatasChrome.teardown();	
	}
	
	
}
