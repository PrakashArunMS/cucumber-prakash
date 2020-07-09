package com.telecomm.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	static WebDriver driver;
@Before
public void beforeScenario() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH\\workspace\\Cucumber1\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.demo.guru99.com/telecom/");
	System.out.println("Before Scenario executed");

}
@After
public void afterScenario() {
	System.out.println("After Scenario executed");
	driver.close();
	

}
}
