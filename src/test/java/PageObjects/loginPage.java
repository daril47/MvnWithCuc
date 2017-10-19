package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;


import PageObjects.base;

public class loginPage {

	By usernameField = By.id("email");
	By passwordField = By.id("passwd");
	By signInButton = By.id("SubmitLogin");
	By authenticationMessage=By.xpath("//p[text()='There is 1 error']");
	
	public void fillTheLoginDatas(String username, String password){
		base.driver.findElement(usernameField).sendKeys(username);
		base.driver.findElement(passwordField).sendKeys(password);	
	}
	
	public void clickOnSignInButton(){
		base.driver.findElement(signInButton).click();
	}
	
	public void verifyAuthenticationMessage(){
				Assert.assertEquals("Authentication fail message expected.", "There is 1 error",base.driver.findElement(authenticationMessage).getText());
	}
}
