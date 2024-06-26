package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;
import io.cucumber.java.en.And;

public class HomePage extends ProjSpecifications{

	@And("Click Leads button")
	public LeadsPage clickLead() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}
}
