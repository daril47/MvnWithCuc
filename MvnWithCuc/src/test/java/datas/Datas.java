package datas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Datas {
	public static WebElement element = null;


		public static void clickOnButton(WebDriver driver){
			element=driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			element.click();
		}
		public static void  fillEmail(WebDriver driver, String email){
			element=driver.findElement(By.id("email"));
			  element.sendKeys(email);
			}
		public static void fillPassword(WebDriver driver, String password){
			element=driver.findElement(By.id("passwd"));
			element.sendKeys("cokolwiek");
		}
		public static void clickOnSubmit(WebDriver driver){
			element=driver.findElement(By.id("SubmitLogin"));
			element.click();
		}
		public static void singleSleep(WebDriver driver) throws InterruptedException{
			Thread.sleep(3000);
		}
		
		public static WebElement WomenButton(WebDriver driver){
			element=driver.findElement(By.xpath("//a[text()='Women']"));
			return element;
		}
		
		public static void clickOnTops(WebDriver driver){
			element=driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul/li[1]/a"));
			element.click();
		}
		
		public static void clickOnBlouse(WebDriver driver){
			element=driver.findElement(By.xpath("//div[@id='categories_block_left']/div/ul/li[2]/a"));
			element.click();
		}
		public static WebElement blouseImg(WebDriver driver){
			element=driver.findElement(By.xpath("//img[@alt='Blouse' and contains(@class,'replace')]"));
			return element;
		}
		public static void clickOnAdd(WebDriver driver){
			element=driver.findElement(By.xpath("//span[text()='Add to cart']"));
			element.click();
		}
		public static void clickOnContinue(WebDriver driver){
			element=driver.findElement(By.xpath("//div[@class='button-container']/span"));
			element.click();
		}
		public static WebElement Cart(WebDriver driver){
			element=driver.findElement(By.xpath("//b[text()='Cart']"));
			return element;
		}

}
