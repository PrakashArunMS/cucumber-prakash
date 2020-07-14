package com.telecomm.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.Objectfactory.AddCustomerPage;
import com.telecom.resources.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerStepps extends Commonaction {
	Commonaction ca=new Commonaction();
	AddCustomerPage acp=new AddCustomerPage();
	
	
	/*static Webdriver driver;
	@Given("User launches the telecom application")
	public void user_launches_the_telecom_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAKASH\\Desktop\\Cucumber-master\\driver\\chromedriver.exe");
		driver = new Chromedriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}
*/
	@Given("User navigates into add customer page1")
	public void user_navigates_into_add_customer_page1() {

		//handleFrame();
		ca.button(acp.getCustomerBtn());
	    
	}
	/*public void handleFrame() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();

	}*/
	@When("User enter all the fields in page1")
	public void user_enter_all_the_fields_in_page1() throws InterruptedException {
		//handleFrame();
		ca.button(acp.getDoneBtn());
		ca.insertText(acp.getFirstName(),"PRAKASH");
		ca.insertText(acp.getLastName(), "Raj");
		ca.insertText(acp.getMail(), "pra@gmail.com");
		ca.insertText(acp.getAddress(), "krishnagiri");
		ca.insertText(acp.getPhno(), "9087678538");
		
		
		
		/*driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys("prakash");
		driver.findElement(By.id("lname")).sendKeys("raj");
		driver.findElement(By.id("email")).sendKeys("praki@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("krishnagiri");
		driver.findElement(By.id("telephoneno")).sendKeys("9952301741");  */
	}
	@When("User enters all the fields by using 1dims list")
	public void user_enters_all_the_fields_by_using_1dims_list(DataTable data1) throws InterruptedException {
		//handleFrame();
		List<String> cusDetails = data1.asList();
		ca.button(acp.getDoneBtn());
		ca.insertText(acp.getFirstName(),cusDetails.get(0));
		ca.insertText(acp.getLastName(),cusDetails.get(1));
		ca.insertText(acp.getMail(), cusDetails.get(2));
		ca.insertText(acp.getAddress(), cusDetails.get(3));
		ca.insertText(acp.getPhno(), cusDetails.get(4));
		
		/*driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0));
		driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1));
		driver.findElement(By.id("email")).sendKeys(cusDetails.get(2));
		driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(4));*/
	}
	
	@When("User enters all the fields by using 1dim map")
	public void user_enters_all_the_fields_by_using_1dim_map(DataTable data2) throws InterruptedException {
		//handleFrame();

		Map<String, String> cusDetails = data2.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDetails.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cusDetails.get("lname"));
		driver.findElement(By.id("email")).sendKeys(cusDetails.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(cusDetails.get("add"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get("phno"));
	}
	
	
	@When("User enters all the fields by using 2dim list1")
	public void user_enters_all_the_fields_by_using_2dim_list1(DataTable dataa) throws InterruptedException {
		//handleFrame();
		List<List<String>> cusDetails = dataa.asLists();
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get(0));
		driver.findElement(By.id("lname")).sendKeys(cusDetails.get(1).get(3));
		driver.findElement(By.id("email")).sendKeys(cusDetails.get(2).get(2));
		driver.findElement(By.name("addr")).sendKeys(cusDetails.get(3).get(1));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get(4));
	}
	@When("User enters all the fields by using 2dim map1")
	public void user_enters_all_the_fields_by_using_2dim_map1(DataTable data4) {
		List<Map<String, String>> cusDetails = data4.asMaps();
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(cusDetails.get(0).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cusDetails.get(2).get("lname"));
		driver.findElement(By.id("email")).sendKeys(cusDetails.get(3).get("mail"));
		driver.findElement(By.name("addr")).sendKeys(cusDetails.get(1).get("add"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusDetails.get(3).get("phno"));
	}
	
	@When("User enters all the fields2 {string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields2(String fname, String lname, String mail, String add, String phno) throws InterruptedException {
//handleFrame();
		
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(mail);
		driver.findElement(By.name("addr")).sendKeys(add);
		driver.findElement(By.id("telephoneno")).sendKeys(phno);
	}
	@When("User click on submit button page1")
	public void user_click_on_submit_button_page1() {
		ca.button(acp.getSubmitBtn());
	}

	@Then("User should be displayed customer id is generated in page1")
	public void user_should_be_displayed_customer_id_is_generated_in_page1() throws InterruptedException {
		//handleFrame();
		
		Assert.assertTrue(acp.getSuccessMessage().isDisplayed());
		driver.quit();
	}
}
