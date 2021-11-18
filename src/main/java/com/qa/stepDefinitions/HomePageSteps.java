package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	HomePage homePage;
	
	@Given("User opens browser")
	public void user_opens_browser() {
	    TestBase.initialization();
	}

	@When("User is on login page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals("Login - My Store", title);
	}

	@Then("User logged in")
	public void user_logged_in() {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Then("Home page is displayed")
	public void Home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
