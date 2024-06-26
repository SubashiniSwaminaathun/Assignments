package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Baseclass{
	@Given("Launch the browser")
	public void Launch() {
		driver=new ChromeDriver();    
	    driver.manage().window().maximize();
	}
	
	@And("Load the URL")
	public void load() {
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	@And("Enter username as Demosalesmanager")
	public void username() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  
	}
	@And("Enter password as crmsfa")
	public void password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	}
	@When("Click the login button")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("It should navigate to next page")
	public void nextPage() {
		String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(text.contains("Welcome")) {
			System.out.println("Navigated to next page");
		}
		else {
			System.out.println("Not logged in");
		}

	}
}
