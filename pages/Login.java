package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends ProjSpecifications{
	

    @Given("Enter username as Demosalesmanager")
	public Login enterUsername() {
    	getDriver().findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
    @And("Enter password as crmsfa")
	public Login enterPassword() {
    	getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

    @When("Click the login button")
	public WelcomePage clickLogin() {
    	getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();

	}
}
