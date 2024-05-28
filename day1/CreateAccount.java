package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	
	    driver.get("http://leaftaps.com/opentaps/.");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	   
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.linkText("Accounts")).click();
	    
	    driver.findElement(By.linkText("Create Account")).click();
	    
	    //Enter an account name. - Enter a description as "Selenium Automation Tester."
	    
	    driver.findElement(By.id("accountName")).sendKeys("Test Account");
	    
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
	    WebElement el1 = driver.findElement(By.name("industryEnumId"));
	    Select s1=new Select(el1);
	    s1.selectByValue("IND_SOFTWARE");
	    
	    //Select "S-Corporation" as ownership using SelectByVisibleText
	    
	    WebElement el2 = driver.findElement(By.name("ownershipEnumId"));
	    Select s2=new Select(el2);
	    s2.selectByVisibleText("S-Corporation");
	    
	    //Select "Employee" as the source using SelectByValue
	    
	    WebElement el3 = driver.findElement(By.name("dataSourceId"));
	    Select s3=new Select(el3);
	    s3.selectByValue("LEAD_EMPLOYEE");
	    
	    //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
	    
	    WebElement el4 = driver.findElement(By.name("marketingCampaignId"));
	    Select s4=new Select(el4);
	    s4.selectByIndex(6);
	    
	    //Select "Texas" as the state/province using SelectByValue.
	    
	    WebElement el5 = driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select s5=new Select(el5);
	    s5.selectByValue("TX");
	    
	    //Click the "Create Account" button
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    Thread.sleep(4000);
		driver.close(); 
	}

}
