package com.telecomm.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddTarifffPlan {
	@Given("User navigates into tarriff plan page")
	public void user_navigates_into_tarriff_plan_page() {
		Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
/*public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		Hooks.driver.switchTo().frame("flow_close_btn_iframe");
		Hooks.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		Hooks.driver.switchTo().defaultContent();

	}*/
	@When("User fillss all the fields")
	public void user_fillss_all_the_fields() throws InterruptedException {
		//handleFrame();
		Hooks.driver.findElement(By.name("rental")).sendKeys("1000");
		Hooks.driver.findElement(By.name("local_minutes")).sendKeys("5000");
		Hooks.driver.findElement(By.name("inter_minutes")).sendKeys("200");
		Hooks.driver.findElement(By.name("sms_pack")).sendKeys("100");
		Hooks.driver.findElement(By.name("minutes_charges")).sendKeys("2");
		Hooks.driver.findElement(By.name("inter_charges")).sendKeys("50");
		Hooks.driver.findElement(By.name("sms_charges")).sendKeys("1"); 
	}
	@When("User fills all the fields by using 1dim list1")
	public void user_fills_all_the_fields_by_using_1dim_list1(DataTable datal) throws InterruptedException {
		//handleFrame();
		List<String> plan = datal.asList();

		Hooks.driver.findElement(By.name("rental")).sendKeys(plan.get(0));
		Hooks.driver.findElement(By.name("local_minutes")).sendKeys(plan.get(1));
		Hooks.driver.findElement(By.name("inter_minutes")).sendKeys(plan.get(2));
		Hooks.driver.findElement(By.name("sms_pack")).sendKeys(plan.get(3));
		Hooks.driver.findElement(By.name("minutes_charges")).sendKeys(plan.get(4));
		Hooks.driver.findElement(By.name("inter_charges")).sendKeys(plan.get(5));
		Hooks.driver.findElement(By.name("sms_charges")).sendKeys(plan.get(6));
	}

	@When("User fills all the fields by using 1dim map1")
	public void user_fills_all_the_fields_by_using_1dim_map1(DataTable datam) throws InterruptedException {
		//handleFrame();
		Map<String, String> planDetails = datam.asMap(String.class, String.class);

		Hooks.driver.findElement(By.name("rental")).sendKeys(planDetails.get("rental"));
		Hooks.driver.findElement(By.name("local_minutes")).sendKeys(planDetails.get("local_minutes"));
		Hooks.driver.findElement(By.name("inter_minutes")).sendKeys(planDetails.get("inter_minutes"));
		Hooks.driver.findElement(By.name("sms_pack")).sendKeys(planDetails.get("sms_pack"));
		Hooks.driver.findElement(By.name("minutes_charges")).sendKeys(planDetails.get("minutes_charges"));
		Hooks.driver.findElement(By.name("inter_charges")).sendKeys(planDetails.get("inter_charges"));
		Hooks.driver.findElement(By.name("sms_charges")).sendKeys(planDetails.get("sms_charges"));
	}

	@When("User fills all the fields by using 2dim list1")
	public void user_fills_all_the_fields_by_using_2dim_list1(DataTable datal) throws InterruptedException {
		//handleFrame();
		List<List<String>> plan = datal.asLists();

		Hooks.driver.findElement(By.name("rental")).sendKeys(plan.get(2).get(0));
		Hooks.driver.findElement(By.name("local_minutes")).sendKeys(plan.get(0).get(1));
		Hooks.driver.findElement(By.name("inter_minutes")).sendKeys(plan.get(3).get(2));
		Hooks.driver.findElement(By.name("sms_pack")).sendKeys(plan.get(0).get(3));
		Hooks.driver.findElement(By.name("minutes_charges")).sendKeys(plan.get(1).get(4));
		Hooks.driver.findElement(By.name("inter_charges")).sendKeys(plan.get(3).get(5));
		Hooks.driver.findElement(By.name("sms_charges")).sendKeys(plan.get(2).get(6));
	}

	@When("User fills all the fields by using 2dim map")
	public void user_fills_all_the_fields_by_using_2dim_map(DataTable datam) throws InterruptedException {
		//handleFrame();
		List<Map<String, String>> planDetails = datam.asMaps();
		
		Hooks.driver.findElement(By.name("rental")).sendKeys(planDetails.get(0).get("rental"));
		Hooks.driver.findElement(By.name("local_minutes")).sendKeys(planDetails.get(3).get("local_minutes"));
		Hooks.driver.findElement(By.name("inter_minutes")).sendKeys(planDetails.get(2).get("inter_minutes"));
		Hooks.driver.findElement(By.name("sms_pack")).sendKeys(planDetails.get(0).get("sms_pack"));
		Hooks.driver.findElement(By.name("minutes_charges")).sendKeys(planDetails.get(1).get("minutes_charges"));
		Hooks.driver.findElement(By.name("inter_charges")).sendKeys(planDetails.get(3).get("inter_charges"));
		Hooks.driver.findElement(By.name("sms_charges")).sendKeys(planDetails.get(2).get("sms_charges"));
	}
	
	@When("User click on Tariiff submit button")
	public void user_click_on_Tariiff_submit_button() {
		Hooks.driver.findElement(By.name("submit")).click();
	}

	@Then("User is displayed with the message tariff plann created")
	public void user_is_displayed_with_the_message_tariff_plann_created() throws InterruptedException {
		//handleFrame();
		Assert.assertTrue(Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		Hooks.driver.quit();
	}

}
