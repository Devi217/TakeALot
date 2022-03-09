Feature: Searching and Buying Products

  Scenario: Search for watches
  Given user naviagtes to Takealot website
	When user searches for "watches"
	And user searches for "Garmin Forerunner 245 Smartwatch - Slate"
	And user adds "garmin-forerunner-245-smartwatch-slate" to cart
	And user searches for "Polaroid PA86 Fit Active Watch - Pink"
	And user adds "polaroid-pa86-fit-active-watch-pink" to cart
	And user clicks on cart button
	Then user selected items are displayed successfully
	 
