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


public class AddCustomerStepps {
	/*static WebAddTarifffPlan.driver AddTarifffPlan.driver;
	@Given("User launches the telecom application")
	public void user_launches_the_telecom_application() {
		System.setProperty("webAddTarifffPlan.driver.chrome.AddTarifffPlan.driver", "C:\\Users\\PRAKASH\\Desktop\\Cucumber-master\\AddTarifffPlan.driver\\chromeAddTarifffPlan.driver.exe");
		AddTarifffPlan.driver = new ChromeAddTarifffPlan.driver();
		AddTarifffPlan.driver.get("http://www.demo.guru99.com/telecom/");
		AddTarifffPlan.driver.manage().window().maximize();
	}
*/
	@Given("User navigates into add customer page1")
	public void user_navigates_into_add_customer_page1() {

		//handleFrame();
		AddTarifffPlan.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}
	/*public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		AddTarifffPlan.driver.switchTo().frame("flow_close_btn_iframe");
		AddTarifffPlan.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		AddTarifffPlan.driver.switchTo().defaultContent();

	}*/
	@When("User enter all the fields in page1")
	public void user_enter_all_the_fields_in_page1() throws InterruptedException {
		//handleFrame();
		
		AddTarifffPlan.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		AddTarifffPlan.driver.findElement(By.id("fname")).sendKeys("prakash");
		AddTarifffPlan.driver.findElement(By.id("lname")).sendKeys("raj");
		AddTarifffPlan.driver.findElement(By.id("email")).sendKeys("praki@gmail.com");
		AddTarifffPlan.driver.findElement(By.name("addr")).sendKeys("krishnagiri");
		AddTarifffPlan.driver.findElement(By.id("telephoneno")).sendKeys("9952301741");  
	}
	@When("User enters all the fields by using 1dims list")
	public void user_enters_all_the_fields_by_using_1dims_list(DataTable data1) throws InterruptedException {
		//handleFrame();
		List<String> cusDetails = data1.asList();

		AddTarifffPlan.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		AddTarifffPlan.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0));
		AddTarifffPlan.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1));
		AddTarifffPlan.driver.findElement(By.id("email")).sendKeys(cusDetails.get(2));
		AddTarifffPlan.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3));
		AddTarifffPlan.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(4));
	}
	
	@When("User enters all the fields by using 1dim map")
	public void user_enters_all_the_fields_by_using_1dim_map(DataTable data2) throws InterruptedException {
		//handleFrame();

		Map<String, String> cusDetails = data2.asMap(String.class, String.class);
		
		AddTarifffPlan.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		AddTarifffPlan.driver.findElement(By.id("fname")).sendKeys(cusDetails.get("fname"));
		AddTarifffPlan.driver.findElement(By.id("lname")).sendKeys(cusDetails.get("lname"));
		AddTarifffPlan.driver.findElement(By.id("email")).sendKeys(cusDetails.get("mail"));
		AddTarifffPlan.driver.findElement(By.name("addr")).sendKeys(cusDetails.get("add"));
		AddTarifffPlan.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get("phno"));
	}
	
	
	@When("User enters all the fields by using 2dim list1")
	public void user_enters_all_the_fields_by_using_2dim_list1(DataTable dataa) throws InterruptedException {
		//handleFrame();
		List<List<String>> cusDetails = dataa.asLists();
		AddTarifffPlan.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		AddTarifffPlan.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get(0));
		AddTarifffPlan.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get(3));
		AddTarifffPlan.driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get(2));
		AddTarifffPlan.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get(1));
		AddTarifffPlan.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get(4));
	}
	@When("User enters all the fields by using 2dim map1")
	public void user_enters_all_the_fields_by_using_2dim_map1(DataTable data4) {
		List<Map<String, String>> cusDetails = data4.asMaps();
		
		AddTarifffPlan.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		AddTarifffPlan.driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get("fname"));
		AddTarifffPlan.driver.findElement(By.id("lname")).sendKeys(cusDetails.get(2).get("lname"));
		AddTarifffPlan.driver.findElement(By.id("email")).sendKeys(cusDetails.get(3).get("mail"));
		AddTarifffPlan.driver.findElement(By.name("addr")).sendKeys(cusDetails.get(1).get("add"));
		AddTarifffPlan.driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get("phno"));
	}
	
	@When("User enters all the fields2 {string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields2(String fname, String lname, String mail, String add, String phno) throws InterruptedException {
//handleFrame();
		
		AddTarifffPlan.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		AddTarifffPlan.driver.findElement(By.id("fname")).sendKeys(fname);
		AddTarifffPlan.driver.findElement(By.id("lname")).sendKeys(lname);
		AddTarifffPlan.driver.findElement(By.id("email")).sendKeys(mail);
		AddTarifffPlan.driver.findElement(By.name("addr")).sendKeys(add);
		AddTarifffPlan.driver.findElement(By.id("telephoneno")).sendKeys(phno);
	}
	@When("User click on submit button page1")
	public void user_click_on_submit_button_page1() {
		AddTarifffPlan.driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}

	@Then("User should be displayed customer id is generated in page1")
	public void user_should_be_displayed_customer_id_is_generated_in_page1() throws InterruptedException {
		//handleFrame();
		
		Assert.assertTrue(AddTarifffPlan.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		AddTarifffPlan.driver.quit();
	}
}
