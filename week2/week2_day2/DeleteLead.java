package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
	    driver.get("http://leaftaps.com/opentaps/.");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	   
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    
	    driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
	    
	    driver.findElement(By.xpath("(//a[contains(@href,'13360')])[2]")).click();		
	    
	    //driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	    
	    
	    	
	}
}
