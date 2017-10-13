package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import datas.LoginDatas;
import datas.addToCartDatas;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class AddToCartSteps {
	
WebDriver driver;
addToCartDatas cartDatas = new addToCartDatas(driver);

	@Given("^User is on main page using firefox$")
	public void user_is_on_main_page_using_firefox() throws InterruptedException   {
		cartDatas.initializeFirefoxDriver(driver);
		Thread.sleep(2500);
		System.out.println("Firefox Driver initialized.");
	   }	      
	

	@When("^User choose blouses from a woman section$")
	public void user_choose_blouses_from_a_woman_section() throws InterruptedException  {
		
		cartDatas.clickOnWomanButton();;
		cartDatas.clickOnTopsButton();
		cartDatas.clickOnBlouse();
		Thread.sleep(3000);
		    
	   
	}

	@When("^User choose the blouse that he likes$")
	public void user_choose_the_blouse_that_he_likes() throws InterruptedException{
		cartDatas.clickOnBlouseImage();
Thread.sleep(1500);
	}

	@When("^User clicks on Add to cart button$")
	public void user_clicks_on_Add_to_cart_button()  {
		cartDatas.clickOnAddButton();
	    
	}

	@When("^User decides to continue shoping$")
	public void user_decides_to_continue_shoping()  {
		cartDatas.clickOnContinue();	    
	}

	@Then("^The chosen product should be added to cart$")
	public void the_chosen_product_should_be_added_to_cart() throws InterruptedException {
		cartDatas.clickOnCartButton();
		Thread.sleep(3000);
		cartDatas.teardown();
	}
	
	@Given("^User is on main page using Chrome$")
	public void user_is_on_main_page_using_Chrome() throws InterruptedException   {
		cartDatas.initializeChromeDriver(driver);
	}

	@When("^User choose blouses from a woman sectionChrome$")
	public void user_choose_blouses_from_a_woman_sectionChrome() throws InterruptedException   {
		cartDatas.clickOnWomanButton();;
		cartDatas.clickOnTopsButton();
		cartDatas.clickOnBlouse();
		Thread.sleep(3000);   
	}

	@When("^User choose the blouse that he likesChrome$")
	public void user_choose_the_blouse_that_he_likesChrome() throws InterruptedException   {
		cartDatas.clickOnBlouseImage();
		Thread.sleep(1500);   
	}

	@When("^User clicks on Add to cart buttonChrome$")
	public void user_clicks_on_Add_to_cart_buttonChrome()  {
		cartDatas.clickOnAddButton();	  
	}

	@When("^User decides to continue shopingChrome$")
	public void user_decides_to_continue_shopingChrome()  {
		cartDatas.clickOnContinue();		   
	}

	@Then("^The chosen product should be added to cartChrome$")
	public void the_chosen_product_should_be_added_to_cartChrome() throws InterruptedException   {
		cartDatas.clickOnCartButton();
		Thread.sleep(3000);
		cartDatas.teardown();
	}

	
	
}


