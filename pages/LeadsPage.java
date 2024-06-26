package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;
import io.cucumber.java.en.And;

public class LeadsPage extends ProjSpecifications{


	@And("Click Create Lead button")
	public CreatLead clickCreatelead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreatLead();

	}

}
