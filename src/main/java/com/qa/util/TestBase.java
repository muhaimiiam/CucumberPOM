package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver driver2;
	public static WebDriverEventListener eventListener;
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("/Users/muhaimi/Documents/eclipse-workspace/CucumberPOM/src/"
					+ "main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/muhaimi/Documents/eclipse-workspace/CucumberPOM/src/main/resources/driver/chromedriver");
			driver= new ChromeDriver();
		}
		else if (browserName.equals("firefox")){
			System.setProperty("webdriver.chrome.driver", "/Users/muhaimi/Documents/eclipse-workspace/CucumberPOM/src/main/resources/driver/chromedriver");
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));

	}
	
	
	

}
