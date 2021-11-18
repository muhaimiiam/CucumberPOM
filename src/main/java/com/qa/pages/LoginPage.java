package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
//	By email = By.name("email");
//	By password = By.name("passwd");
//	By btnLogin = By.name("SubmitLogin");
	
	@FindBy(id="email")
	WebElement txtEmail;
	
	@FindBy(id="passwd")
	WebElement txtPass;
	
	@FindBy(id="SubmitLogin")
	WebElement btnLogin;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();

	}
	
	public HomePage login(String em, String pass) {
		
//		txtEmail.sendKeys("testmu001@mailinator.com");
//		txtPass.sendKeys("Muh41m1n");
		
		txtEmail.sendKeys(em);
		txtPass.sendKeys(pass);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", btnLogin);
		
		return new HomePage();
		
	}

}
