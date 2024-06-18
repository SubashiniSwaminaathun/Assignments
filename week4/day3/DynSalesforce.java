package week4.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynSalesforce extends BaseforSalesforce{
	
	@DataProvider(name="fetch")
	public String[][] sendData(){
		String[][] data=new String[2][2];
		data[0][0]="Subashini";
		data[0][1]="Testleaf";
		
		data[1][0]="tl";
		data[1][1]="tl";


		return data;
	}
	@Test(dataProvider="fetch")
	public void newEntry(String entity,String cname) throws InterruptedException {
	//Click on the toggle menu button from the left corner
			//- Click View All and click Legal Entities from App Launcher
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
			
			//Clicking legal entities
			Thread.sleep(4000);
			WebElement el = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",el);
			
			
			//Clicking new in legal entities
			driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
			
			//Entering legal entity and company name
			driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(entity);
			driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(cname);
			
			//entering desc
			driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
			
			//Selecting active
			driver.findElement(By.xpath("//button[@id='combobox-button-303']")).click();
			driver.findElement(By.xpath("//span[text()='Active']")).click();
			
			//Save
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			
			//Verify alert
			Alert al = driver.switchTo().alert();
			String text = al.getText();
			if(text.contains("Testleaf")) {
				System.out.println("Company name matching");
			}
	}

}
