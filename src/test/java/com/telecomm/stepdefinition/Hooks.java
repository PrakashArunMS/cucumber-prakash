package com.telecomm.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commonaction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonaction {
	Commonaction ca=new Commonaction();
@Before
public void beforeScenario() {
	
	ca.lanuch("http://www.demo.guru99.com/telecom/");
	System.out.println("Before Scenario executed");

}
@After
public void afterScenario() {
	System.out.println("After Scenario executed");
	driver.close();
	

}
}
