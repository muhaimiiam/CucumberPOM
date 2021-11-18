package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name="search_query")
	WebElement txtSearch;
	
	@FindBy(name="submit_search")
	WebElement btnSearch;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	// comment
}
