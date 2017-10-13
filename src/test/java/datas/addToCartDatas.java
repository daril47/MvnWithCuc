package datas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addToCartDatas {

	WebDriver driver;
	By womanButton = By.xpath("//a[text()='Women']");
	By topsButton = By.xpath("//div[@id='categories_block_left']/div/ul/li[1]/a");
	By blouseButton=By.xpath("//div[@id='categories_block_left']/div/ul/li[2]/a");
	By scrollElement=By.xpath("//img[@alt='Blouse' and contains(@class,'replace')]");
	By blouseImage=By.xpath("//img[@alt='Blouse' and contains(@class,'replace')]");
	By addButton = By.xpath("//span[text()='Add to cart']");
	By continueButton=By.xpath("//div[@class='button-container']/span");
	By cartButton=By.xpath("//b[text()='Cart']");
	
	public addToCartDatas(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickOnWomanButton(){
		driver.findElement(womanButton).click();
	}
	
	public void clickOnTopsButton(){
		driver.findElement(topsButton).click();
	}
	
	public void scrollToElement(){
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement scroll=driver.findElement(scrollElement);
		jse.executeScript("return arguments[0].scrollIntoView();", scroll);
	}
	
	public void clickOnBlouse(){
		driver.findElement(blouseButton).click();
	}
	
	public void clickOnBlouseImage(){
		driver.findElement(blouseImage).click();
	}
	
	public void clickOnAddButton(){
		driver.findElement(addButton).click();
	}
	
	public void clickOnContinue(){
		driver.findElement(continueButton).click();
	}
	
	public void clickOnCartButton(){
		driver.findElement(cartButton).click();
	}
	
	public void switchToFrame() {
		driver.switchTo().frame("fancybox-frame1507886137712");
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
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	


	public void singleSleep(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
	}	


	
}
