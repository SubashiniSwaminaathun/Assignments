package week4.day3;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterCreateLead extends Baseclass{
	
	@DataProvider
	public String[][] sendData(){
		String[][] data=new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="ABC";
		data[0][2]="R";
		
		data[1][0]="TestLeaf";
		data[1][1]="XYZ";
		data[1][2]="R";
		return data;
	}
	
	@Test(dataProvider="sendData")
		public void createLead(String cname,String fname,String lname) {
					
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			driver.findElement(By.name("submitButton")).click();
			
	
	}


}
