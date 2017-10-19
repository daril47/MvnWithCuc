package stepDefinitions;

import PageObjects.MainPage;
import PageObjects.loginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginFeatureSteps {
	
	MainPage mainp=new MainPage();
	loginPage loginp=new loginPage();
	
	
	
	@Given("^User is on Main Page$")
	public void user_is_on_Main_Page() {
		mainp.loadMainPage();	   
	}

	@When("^User clicks on Sign In button$")
	public void user_clicks_on_Sign_In_button()  {
		mainp.clickOnSignInButton();
	}

	@When("^User provides email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_provides_email_and_password(String arg1, String arg2) throws Throwable {
	    loginp.fillTheLoginDatas(arg1, arg2);
	}

	@When("^User clicks the continue button$")
	public void user_clicks_the_continue_button()  {
	    loginp.clickOnSignInButton();	    
	}

	@Then("^The error message should be displayed$")
	public void the_error_message_should_be_displayed()  {
	    loginp.verifyAuthenticationMessage();
	}

}
