package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;

public class CreateLead extends ProjSpecifications{
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
		}

	public CreateLead enterCompany() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");

		return this;
	}
	
	public CreateLead enterFname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("New");
		return this;

	}
	
	public CreateLead enterLname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("User");
		return this;

	}
	
	public ViewLead clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);

	}

}
