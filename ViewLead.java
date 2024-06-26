package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjSpecifications;

public class ViewLead extends ProjSpecifications{
	
	public ViewLead(ChromeDriver driver) {
		this.driver=driver;
	}


	public void verify() {
		String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(fname.equals("New")) {
			System.out.println("Lead created");
		}
		else {
			System.out.println("Lead not created");
		}
	}

}
