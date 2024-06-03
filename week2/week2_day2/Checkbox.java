package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
	    driver.get("https://leafground.com/checkbox.xhtml");
	    
	    driver.manage().window().maximize();
	
	    //basic checkbox
	    
	    driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	    
	  //notification chkbox
	    
	    driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	    
	   //Python
	    		
	    driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
	    
	    //Tri state box
	    
	    driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
	    
	  //Toggle switch
	    
	    driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	    
	    //Selecting cities
	    
	    driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
	    
	    
	    

	}

}
