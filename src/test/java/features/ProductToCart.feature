Feature: Adding a product to cart

@CartFirefox
Scenario: Adding a product to cart using Firefox browser
Given User is on main page using firefox
When User choose blouses from a woman section
And User choose the blouse that he likes
And User clicks on Add to cart button
And User decides to continue shoping
Then The chosen product should be added to cart

@CartChrome
Scenario: Adding a product to cart using Chrome browser
Given User is on main page using Chrome
When User choose blouses from a woman sectionChrome
And User choose the blouse that he likesChrome
And User clicks on Add to cart buttonChrome
And User decides to continue shopingChrome
Then The chosen product should be added to cartChrome