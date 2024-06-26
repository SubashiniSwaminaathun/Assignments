package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;

public class Login extends ProjSpecifications{
	
	
	public Login(ChromeDriver driver) {
		this.driver=driver;

	}


	public Login enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public Login enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);

	}
}
