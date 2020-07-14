package com.telecom.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonaction {
public static WebDriver driver;
public void lanuch(String url) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH\\workspace\\Cucumber1\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url); 
}
public void insertText(WebElement element,String Value)
{
	element.sendKeys();
}
public void button(WebElement element) {
	
element.click();
}
}

