package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import PageObjects.base;

public class MainPage {
	
	Actions action=new Actions(base.driver);
	
	String baseUrl="http://automationpractice.com/index.php";
	By signInButton=By.xpath("//a[@class='login' and contains(text(),'Sign')]");
	By womenSection=By.xpath("//a[text()='Women']");
	By blousesSection=By.xpath("//a[text()='Blouses']");
	
	public void clickOnSignInButton(){
		base.driver.findElement(signInButton).click();
	}
	
	public void loadMainPage(){
		base.driver.get(baseUrl);
	}

	public void goToBlousesSection() throws InterruptedException{
		action.moveToElement(base.driver.findElement(womenSection)).perform();
		Thread.sleep(2000);
		base.driver.findElement(blousesSection).click();
	}
	
	
	
}
