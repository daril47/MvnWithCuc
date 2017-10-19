package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class blouseSectionPage {
	
	Actions action=new Actions(base.driver);
	
	By blouseImage=By.xpath("//img[@alt='Blouse' and contains(@class,'replace')]");
	By addButton=By.xpath("//span[text()='Add to cart']");
	By continueButton=By.xpath("//span[contains(@class,'continue btn')]");
	By shoppingCart=By.xpath("//a[contains(@title,'View my')]");
	By blouseInCart = By.xpath("//a[contains(@class,'cart_block') and @title='Blouse']");
	
	public void mouseHoverOnBlouse() throws InterruptedException{
		action.moveToElement(base.driver.findElement(blouseImage)).perform();
		Thread.sleep(3000);
	}
	
	public void addToCart() throws InterruptedException{
		base.driver.findElement(addButton).click();
		Thread.sleep(2000);
	}
	
	public void scrollToBlouseImg()
	{
		JavascriptExecutor jse = (JavascriptExecutor) base.driver;
		jse.executeScript("return arguments[0].scrollIntoView();", base.driver.findElement(By.xpath("//span[text()='Styles']")));
	}
	
	public void clickOnContinue(){
		base.driver.findElement(continueButton).click();
	}
	
	
	public void verifyIfProductIsAdded() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor) base.driver;
		jse.executeScript("return arguments[0].scrollIntoView();", base.driver.findElement(By.xpath("//button[@name='submit_search']")));
		
		action.moveToElement(base.driver.findElement(shoppingCart)).perform();
		Thread.sleep(1500);
		Assert.assertEquals(true, base.driver.findElement(blouseInCart).isDisplayed());
	}

}
