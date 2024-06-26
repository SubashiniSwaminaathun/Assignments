package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;

public class LeadsPage extends ProjSpecifications{
	
	public LeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	

	public CreateLead clickCreatelead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);

	}

}
