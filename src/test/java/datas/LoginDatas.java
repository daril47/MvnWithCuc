package datas;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class LoginDatas {
	
	 WebDriver driver;
	
	 By signInButton= By.xpath("//a[contains(text(),'Sign in')]");
	 By userName=By.id("email");
	 By loginPassword=By.id("passwd");
	 By submitButton=By.id("SubmitLogin");
	 public By failureMessage=By.xpath("//div[contains(@class,'alert')]//p");
	 
	 public LoginDatas(WebDriver driver){
		 this.driver=driver;
	 }
	 	 	 
	 public void clickOnSignInButton(){
		 driver.findElement(signInButton).click();
	 }
	 
	 public void setLoginDatas(String email, String password){
		 driver.findElement(userName).sendKeys(email);
		 driver.findElement(loginPassword).sendKeys(password);
	 }
	 
	 public void clickOnSubmitButton(){
		 driver.findElement(submitButton).click();
	 }
	
	public void initializeFirefoxDriver(WebDriver driver) {
		String baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.gecko.driver","C:\\kgruza\\geckodriver\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		this.driver = driver;
		driver.get(baseUrl);
	}
	
	public  void teardown(){
		driver.quit();
	}

	public void initializeChromeDriver(WebDriver driver) {
		String baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "C:\\kgruza\\chromedriver.exe");
		driver = new ChromeDriver();
		this.driver = driver;
		driver.get(baseUrl);
	}
	
	public void singleSleep(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
	}



}
