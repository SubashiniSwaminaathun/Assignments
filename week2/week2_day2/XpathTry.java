package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTry {
public static void main(String[] args) {
	
ChromeDriver driver=new ChromeDriver();
 
    driver.get("http://leaftaps.com/opentaps/control/main");

    driver.manage().window().maximize();

    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
    
    driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
    
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    
    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
    
  //input[@id='username']/parent::div
  //div[@id='idcard-container']/input
    
    
    //parent to child:
    	//div[@id='idcard.container']/class

    	//child to parent:
    	//input[@id='username']/Parent::div
}
}
