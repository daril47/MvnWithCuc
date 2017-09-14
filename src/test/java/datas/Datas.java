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

public class Datas {
	
	
	
	public WebElement element;
	public WebDriver driver;
	
	
	
	public void initializeFirefoxDriver(WebDriver driver) {
		String baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.gecko.driver","C:\\kgruza\\geckodriver\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		this.driver = driver;
		driver.get(baseUrl);
	}

	public void initializeChromeDriver(WebDriver driver) {
		String baseUrl = "http://automationpractice.com/index.php";
		System.setProperty("webdriver.chrome.driver", "C:\\kgruza\\chromedriver.exe");
		driver = new ChromeDriver();
		this.driver = driver;
		driver.get(baseUrl);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement signInButton;
	
    public void clickOnSignInButton(WebDriver driver){
        signInButton.click();
}
	
	public void clickOnButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		element.click();
	}

	public void fillLoginDatas(WebDriver driver, String email, String password) {
		element = driver.findElement(By.id("email"));
		element.sendKeys(email);
		element = driver.findElement(By.id("passwd"));
		element.sendKeys(password);
	}

	
	public void clickOnSubmit(WebDriver driver) {
		element = driver.findElement(By.id("SubmitLogin"));
		element.click();
	}

	public void singleSleep(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
	}

	public WebElement WomenButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Women']"));
		return element;
	}

	public void clickOnTops(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul/li[1]/a"));
		element.click();
	}

	public void clickOnBlouse(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul/li[2]/a"));
		element.click();
	}

	public WebElement blouseImg(WebDriver driver) {
		element = driver.findElement(By.xpath("//img[@alt='Blouse' and contains(@class,'replace')]"));
		return element;
	}

	public void clickOnAdd(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		element.click();
	}

	public void clickOnContinue(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='button-container']/span"));
		element.click();
	}

	public WebElement Cart(WebDriver driver) {
		element = driver.findElement(By.xpath("//b[text()='Cart']"));
		return element;
	}

}
