package pages;

import org.openqa.selenium.By;

import base.ProjSpecifications;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreatLead extends ProjSpecifications{
	

	@Given("ENter company name as (.*)$")
	public CreatLead enterCompany(String company) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	@And("Enter firstname as (.*)$")
	public CreatLead enterFname(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;

	}
	
	@And("Enter lastname as (.*)$")
	public CreatLead enterLname(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;

	}
	
	@When("Click Submit button")
	public ViewLead clickSubmit() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLead();

	}

}
