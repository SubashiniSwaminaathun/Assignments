package steps;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends Baseclass{

	@When("Click CRMSFA link")
	public void click_crmsfa_link() {
	    
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click Leads button")
	public void click_leads_button() {
	    
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click Create Lead button")
	public void click_create_lead_button() {
	    
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("ENter company name as (.*)$")
	public void e_nter_company_name_as_testleaf(String company) {
	   
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	@Given("Enter firstname as (.*)$")
	public void enter_firstname_as_vineeth(String fname) {
	    
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		
	}
	@Given("Enter lastname as (.*)$")
	public void enter_lastname_as_r(String lname) {
	    
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click Submit button")
	public void click_submit_button() {
	    
		driver.findElement(By.name("submitButton")).click();
		
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
	    
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.equals("Vineeth")) {
			System.out.println("Lead created");
		}
		else {
			System.out.println("Lead not created");
		}
	}
}
