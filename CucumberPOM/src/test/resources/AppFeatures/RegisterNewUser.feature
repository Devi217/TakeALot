
Feature: Registration Feature

Scenario: Successful display of Registration page
Given user naviagtes to Takealot website
When user clicks on Register link
Then Registration page is displayed successfully

Scenario: Succesfull Registration of new user
Given user naviagtes to Takealot website
When user clicks on Register link
And user provides all required details
|FirstName |LastName |Email               |RetypeEmail         |Password |RetypePassword |MobileNumber|
|shane2     |warn2     |warn.s29006@gmail.com|warn.s29006@gmail.com|Shane@123|Shane@123      |07458149339 |
And user clicks on Register button
Then user is susscessfuly Registered