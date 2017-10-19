
Feature: Adding a product to cart
@Cart
	Scenario: Adding a blouse to cart
	Given User is on Main Page
	When User choose the Woman section, then Tops section and then Blouses section
	And User clicks on the blouse
	And User clicks on the Add to cart button
	And User decides to continue shopping
	Then Chosen blouse should be displayed in the cart