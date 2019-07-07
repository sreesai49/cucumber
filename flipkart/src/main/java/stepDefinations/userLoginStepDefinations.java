package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class userLoginStepDefinations {
	
	public WebDriver driver;
	
	@Given("^Launch flipkart website in browser$")
	public void launch_flipkart_website_in_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("", "");
		driver = new ChromeDriver();
	}

	@Given("^Open registration form$")
	public void open_registration_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^fill the form with user details$")
	public void fill_the_form_with_user_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Click on Register button$")
	public void click_on_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify that user is registered successfully$")
	public void verify_that_user_is_registered_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Enter user username and password$")
	public void enter_user_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^verify that user is logged in successfully$")
	public void verify_that_user_is_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Enter user username (\\d+) and password Sai@(\\d+)$")
	public void enter_user_username_and_password_Sai(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^Enter user username ssaaii(\\d+)@gmail\\.com and password Sai@(\\d+)$")
	public void enter_user_username_ssaaii_gmail_com_and_password_Sai(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
