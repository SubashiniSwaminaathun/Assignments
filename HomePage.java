package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;

public class HomePage extends ProjSpecifications{


	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}


	public LeadsPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}
}
