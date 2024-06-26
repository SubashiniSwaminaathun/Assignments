package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;
import io.cucumber.java.en.Then;

public class ViewLead extends ProjSpecifications{
	
	@Then("Lead should be created")
	public void verify() {
		String fname = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
		if(fname.equals("New")) {
			System.out.println("Lead created");
		}
		else {
			System.out.println("Lead not created");
		}
	}

}
