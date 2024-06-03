package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTry {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    
    //load the url
    
    driver.get("http://leaftaps.com/opentaps/control/main");
    
    //maximise
    
    driver.manage().window().maximize();
    
    //to enter the value in the text field-sendKeys
    
    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    
    //to enter the password
    
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    //By classname
    
    driver.findElement(By.className("decorativeSubmit")).click();
    
    //By link text
    //driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.partialLinkText("M/S")).click();
    
    driver.findElement(By.tagName("a")).click();
    
    //driver.findElement(By.linkText("Lead")).click();
    
    //driver.findElement(By.linkText("Create Lead")).click();
    
    //WebElement dr1=driver.findElement(By.id("))
}
}
