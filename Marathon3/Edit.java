package Marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit extends BaseforSalesforce{
	
	@Test
	public void editOppurtunity() throws InterruptedException {
		
		
	     //Search for the Opportunity 'Salesforce Automation by Your Name'.
			String opportunityName = "Jim";
			WebElement searchField=driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
			searchField.sendKeys(opportunityName);
			searchField.sendKeys(Keys.ENTER);
			
	                Thread.sleep(3000);
			//Click on the Dropdown icon and select 'Edit'.
			
			driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]/child::div[1]/a/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@title='Edit']")).click();
			
		
		    //11.Choose the close date as Tomorrow's date.
			driver.findElement(By.xpath("//input[@name='CloseDate']")).clear();
			driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("24/06/2024");
			
		    //12.Select 'Stage' as 'Perception Analysis'.
			
			driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
			driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
			
		    //13.Select 'Delivery/Installation Status' as 'In Progress'.
			
			driver.findElement(By.xpath("(//button[@role='combobox'])[5]")).click();
			driver.findElement(By.xpath("//span[@title='In progress']")).click();
			
		    //14.Enter Description as 'SalesForce'.
			
			WebElement el1 = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
					JavascriptExecutor jse1=(JavascriptExecutor)driver;
			jse1.executeScript("arguments[0].click()",el1);
			
			driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
			
		    //15.Click on 'Save' and verify the Stage as 'Perception Analysis'.
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			
			

		
		
	}

}
