package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjSpecifications extends AbstractTestNGCucumberTests{
	
	//public ChromeDriver driver;
	
	private static final ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();
	
	public void setDriver() {
		cDriver.set(new ChromeDriver());
	}
	
	public ChromeDriver getDriver() {
		return cDriver.get();
	}
	
	@BeforeMethod
		public void preCon() {
		//driver = new ChromeDriver();
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void postCon() {
		getDriver().close();

	}


}
