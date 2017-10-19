package driversIni;


import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class initialization {
	
	@Before
	public  void setUp( ){
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		base.driver = new ChromeDriver();
		base.driver.manage().window().maximize();
		}
	
	@After
	public void tearDown(){
		base.driver.quit();
	}
	

}
