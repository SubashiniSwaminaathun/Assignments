package week4.day3;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterEditLead extends Baseclass{
	
	@DataProvider(name="fetch")
	public String[][] sendData(){
		String[][] data=new String[2][2];
		data[0][0]="123";
		data[0][1]="ABC";

		data[1][0]="456";
		data[1][1]="XYZ";

		return data;
	}
	@Test(dataProvider="fetch")
	public void editLead(String num,String cname) throws InterruptedException {
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(num);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();

}

}
