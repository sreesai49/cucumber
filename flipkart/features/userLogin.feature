Feature: User login functionalities
Description Test all the user login functionalities

Scenario: Verify user registration with valid data
	Given Launch flipkart website in browser
	And Open registration form
	And fill the form with user details
	And Click on Register button
	Then Verify that user is registered successfully
	

Scenario: Verify user login functionality with valid data
	Given Launch flipkart website in browser
	And Enter user username and password
	And Click on login button
	Then verify that user is logged in successfully
	
Scenario Outline: Verify user login functionality with all data
	Given Launch flipkart website in browser
	And Enter user username <username> and password <password>
	And Click on login button
	Then verify that user is logged in successfully
	
	Examples:
	| username | password |
	| 9491862195 | Sai@9491 |
	| ssaaii4499@gmail.com | Sai@9491 |
