package Marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseforSalesforce {
	
	public static ChromeDriver driver;

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precon(String URL,String uname,String pwd) throws InterruptedException {
	//1. Load the url 		
    driver =new ChromeDriver();		
    driver.get(URL);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    //Pass username/password-Login
    driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("Login")).click();
	
	Thread.sleep(4000);
	//Click toggle
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	
	//Click View all
	driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	
	//Click Sales
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	//Click Opportunities tab
	WebElement el = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()",el);
	}
	
	@AfterMethod
	public void postcon() {
		driver.close();
		
	}
}
