package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;

public class WelcomePage extends ProjSpecifications{
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	

	public WelcomePage verifyLogin() {
		String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(text.contains("Welcome")) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Not logged in");
		}
		return this;
	}
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);

	}

}
