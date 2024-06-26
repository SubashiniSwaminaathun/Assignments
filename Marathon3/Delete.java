package Marathon3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Delete extends BaseforSalesforce{
	
	@Test
	public void deleteOppurtunity() throws InterruptedException{
		
		//Search for the Opportunity 'Salesforce Automation by Your Name'.
		String opportunityName = "Jim";
		WebElement searchField=driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		searchField.sendKeys(opportunityName);
		searchField.sendKeys(Keys.ENTER);
		
                Thread.sleep(3000);
		//Click on the Dropdown icon and select 'Edit'.
		
		driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]/child::div[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		String text = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']")).getText();
		if(text.contains(opportunityName)) {
			System.out.println("Oppurtunity deleted successfully");
		}
		
	}

}
