package Marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Create extends BaseforSalesforce{
	
	@DataProvider(name="fetch")
	public String[][] sendData() throws IOException{
		
		return ReadExcel.readData();
	}
	
	@Test(dataProvider="fetch")
	public void createOppurtunity(String name,String amt,String date) throws InterruptedException {
		
		//Click New
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		//Enter opportunity name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		
		//Enter Amount
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amt);
		
		//Enter date
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(date);
		
		Thread.sleep(1000);
		//Select 'Stage' as 'Need Analysis'
		//WebElement need = 
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
				driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
				
		//Select SAVE
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		
		//Verify name
		String text = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
		if(text.contains(name)) {
			System.out.println("Opportunity got created successfully");
		}
		
		
	}

}
