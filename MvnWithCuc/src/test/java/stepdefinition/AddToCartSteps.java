package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import datas.Datas;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class AddToCartSteps {
	
static WebDriver driver;
Datas datas = new Datas();
//Actions action=new Actions(driver);
	@Given("^User is on main page using firefox$")
	public void user_is_on_main_page_using_firefox() throws InterruptedException   {
		String baseUrl="http://automationpractice.com/index.php";
		System.setProperty("webdriver.gecko.driver","C:\\kgruza\\geckodriver\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver(options);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2500);
	   }	      
	

	@When("^User choose blouses from a woman section$")
	public void user_choose_blouses_from_a_woman_section() throws InterruptedException  {
		
		datas.WomenButton(driver).click();
		datas.singleSleep(driver);
		datas.clickOnTops(driver);
		datas.singleSleep(driver);
		datas.clickOnBlouse(driver);
	    
	   
	}

	@When("^User choose the blouse that he likes$")
	public void user_choose_the_blouse_that_he_likes() throws InterruptedException{
		datas.blouseImg(driver).click();
Thread.sleep(1500);
	}

	@When("^User clicks on Add to cart button$")
	public void user_clicks_on_Add_to_cart_button()  {
	   datas.clickOnAdd(driver);
	    
	}

	@When("^User decides to continue shoping$")
	public void user_decides_to_continue_shoping()  {
datas.clickOnContinue(driver);	    
	}

	@Then("^The chosen product should be added to cart$")
	public void the_chosen_product_should_be_added_to_cart() {
		datas.Cart(driver).click();
		driver.close();
	}
	
	@Given("^User is on main page using Chrome$")
	public void user_is_on_main_page_using_Chrome() throws InterruptedException   {
		String baseUrl="http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "C:\\kgruza\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);	   
	}

	@When("^User choose blouses from a woman sectionChrome$")
	public void user_choose_blouses_from_a_woman_sectionChrome() throws InterruptedException   {
		datas.WomenButton(driver).click();
		datas.singleSleep(driver);
		datas.clickOnTops(driver);
		datas.singleSleep(driver);
		datas.clickOnBlouse(driver);	   
	}

	@When("^User choose the blouse that he likesChrome$")
	public void user_choose_the_blouse_that_he_likesChrome() throws InterruptedException   {
		datas.blouseImg(driver).click();
		Thread.sleep(1500);	     
	}

	@When("^User clicks on Add to cart buttonChrome$")
	public void user_clicks_on_Add_to_cart_buttonChrome()  {
		datas.clickOnAdd(driver);	  
	}

	@When("^User decides to continue shopingChrome$")
	public void user_decides_to_continue_shopingChrome()  {
		datas.clickOnContinue(driver);		   
	}

	@Then("^The chosen product should be added to cartChrome$")
	public void the_chosen_product_should_be_added_to_cartChrome()   {
		datas.Cart(driver).click();
		driver.close();
	}

	
	
}


