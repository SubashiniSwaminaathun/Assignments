package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjSpecifications{
	
	
	@Then("It should navigate to next page")
	public WelcomePage verifyLogin() {
		String text = getDriver().findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(text.contains("Welcome")) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Not logged in");
		}
		return this;
	}
	
	@When("Click CRMSFA link")
	public HomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();

	}

}
