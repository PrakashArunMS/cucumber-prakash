package com.telecomm.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTarifffPlan {
	
	static WebDriver driver;
	@Given("User launch tellecom application")
	public void user_launch_tellecom_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH\\workspace\\Cucumber1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("User navigates into tarriff plan page")
	public void user_navigates_into_tarriff_plan_page() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
/*public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();

	}*/
	@When("User fillss all the fields")
	public void user_fillss_all_the_fields() throws InterruptedException {
		//handleFrame();
		driver.findElement(By.name("rental")).sendKeys("1000");
		driver.findElement(By.name("local_minutes")).sendKeys("5000");
		driver.findElement(By.name("inter_minutes")).sendKeys("200");
		driver.findElement(By.name("sms_pack")).sendKeys("100");
		driver.findElement(By.name("minutes_charges")).sendKeys("2");
		driver.findElement(By.name("inter_charges")).sendKeys("50");
		driver.findElement(By.name("sms_charges")).sendKeys("1"); 
	}
	@When("User fills all the fields by using 1dim list1")
	public void user_fills_all_the_fields_by_using_1dim_list1(DataTable datal) throws InterruptedException {
		//handleFrame();
		List<String> plan = datal.asList();

		driver.findElement(By.name("rental")).sendKeys(plan.get(0));
		driver.findElement(By.name("local_minutes")).sendKeys(plan.get(1));
		driver.findElement(By.name("inter_minutes")).sendKeys(plan.get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(plan.get(3));
		driver.findElement(By.name("minutes_charges")).sendKeys(plan.get(4));
		driver.findElement(By.name("inter_charges")).sendKeys(plan.get(5));
		driver.findElement(By.name("sms_charges")).sendKeys(plan.get(6));
	}

	@When("User fills all the fields by using 1dim map1")
	public void user_fills_all_the_fields_by_using_1dim_map1(DataTable datam) throws InterruptedException {
		//handleFrame();
		Map<String, String> planDetails = datam.asMap(String.class, String.class);

		driver.findElement(By.name("rental")).sendKeys(planDetails.get("rental"));
		driver.findElement(By.name("local_minutes")).sendKeys(planDetails.get("local_minutes"));
		driver.findElement(By.name("inter_minutes")).sendKeys(planDetails.get("inter_minutes"));
		driver.findElement(By.name("sms_pack")).sendKeys(planDetails.get("sms_pack"));
		driver.findElement(By.name("minutes_charges")).sendKeys(planDetails.get("minutes_charges"));
		driver.findElement(By.name("inter_charges")).sendKeys(planDetails.get("inter_charges"));
		driver.findElement(By.name("sms_charges")).sendKeys(planDetails.get("sms_charges"));
	}

	@When("User fills all the fields by using 2dim list1")
	public void user_fills_all_the_fields_by_using_2dim_list1(DataTable datal) throws InterruptedException {
		//handleFrame();
		List<List<String>> plan = datal.asLists();

		driver.findElement(By.name("rental")).sendKeys(plan.get(2).get(0));
		driver.findElement(By.name("local_minutes")).sendKeys(plan.get(0).get(1));
		driver.findElement(By.name("inter_minutes")).sendKeys(plan.get(3).get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(plan.get(0).get(3));
		driver.findElement(By.name("minutes_charges")).sendKeys(plan.get(1).get(4));
		driver.findElement(By.name("inter_charges")).sendKeys(plan.get(3).get(5));
		driver.findElement(By.name("sms_charges")).sendKeys(plan.get(2).get(6));
	}

	@When("User fills all the fields by using 2dim map")
	public void user_fills_all_the_fields_by_using_2dim_map(DataTable datam) throws InterruptedException {
		//handleFrame();
		List<Map<String, String>> planDetails = datam.asMaps();
		
		driver.findElement(By.name("rental")).sendKeys(planDetails.get(0).get("rental"));
		driver.findElement(By.name("local_minutes")).sendKeys(planDetails.get(3).get("local_minutes"));
		driver.findElement(By.name("inter_minutes")).sendKeys(planDetails.get(2).get("inter_minutes"));
		driver.findElement(By.name("sms_pack")).sendKeys(planDetails.get(0).get("sms_pack"));
		driver.findElement(By.name("minutes_charges")).sendKeys(planDetails.get(1).get("minutes_charges"));
		driver.findElement(By.name("inter_charges")).sendKeys(planDetails.get(3).get("inter_charges"));
		driver.findElement(By.name("sms_charges")).sendKeys(planDetails.get(2).get("sms_charges"));
	}
	
	@When("User click on Tariiff submit button")
	public void user_click_on_Tariiff_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("User is displayed with the message tariff plann created")
	public void user_is_displayed_with_the_message_tariff_plann_created() throws InterruptedException {
		//handleFrame();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		driver.quit();
	}

}
