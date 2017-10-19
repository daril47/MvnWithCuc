package stepDefinitions;

import PageObjects.MainPage;
import PageObjects.blouseSectionPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addToCartSteps {

	MainPage mainp=new MainPage();
	blouseSectionPage blousep=new blouseSectionPage();
	
	@When("^User choose the Woman section, then Tops section and then Blouses section$")
	public void user_choose_the_Woman_section_then_Tops_section_and_then_Blouses_section() throws InterruptedException  {
		mainp.goToBlousesSection();
	    
	}

	@When("^User clicks on the blouse$")
	public void user_clicks_on_the_blouse() throws InterruptedException  {
		blousep.scrollToBlouseImg();
		Thread.sleep(2000);
		blousep.mouseHoverOnBlouse();
	   
	}

	@When("^User clicks on the Add to cart button$")
	public void user_clicks_on_the_Add_to_cart_button() throws InterruptedException  {
		blousep.addToCart();
		}

	@When("^User decides to continue shopping$")
	public void user_decides_to_continue_shopping() {
		blousep.clickOnContinue();
	    
	}

	@Then("^Chosen blouse should be displayed in the cart$")
	public void chosen_blouse_should_be_displayed_in_the_cart() throws InterruptedException  {
	    blousep.verifyIfProductIsAdded();
	}
	
}
