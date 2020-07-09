package com.telecomm.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTariffPlan2 {
	static WebDriver driver;
	
	@Given("User launch the tellecom application3")
	public void user_launch_the_tellecom_application3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH\\workspace\\Cucumber1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("User navigates into tarriff plan page3")
	public void user_navigates_into_tarriff_plan_page3() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
	/*public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		//driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		//driver.switchTo().defaultContent();

	}*/
	@When("User must fills all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_must_fills_all_the_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
	//handleFrame();
		
		driver.findElement(By.name("rental")).sendKeys(string);
		driver.findElement(By.name("local_minutes")).sendKeys(string2);
		driver.findElement(By.name("inter_minutes")).sendKeys(string3);
		driver.findElement(By.name("sms_pack")).sendKeys(string4);
		driver.findElement(By.name("minutes_charges")).sendKeys(string5);
		driver.findElement(By.name("inter_charges")).sendKeys(string6);
		driver.findElement(By.name("sms_charges")).sendKeys(string7);
	}

	@When("User click on Tariiff3 submit button")
	public void user_click_on_Tariiff3_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("User is displayed with  message tariff plann3 created")
	public void user_is_displayed_with_message_tariff_plann3_created() throws InterruptedException {
		//handleFrame();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		driver.quit();
	}


	
}






