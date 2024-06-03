package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
		
	    driver.get("http://leaftaps.com/opentaps/.");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	   
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	   
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    
	    driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Testleaf");
	    
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("New");
	    
	    driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("User");
	    
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("New testing user");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("newuser@gmail.com");
	    //New York

	    WebElement el2 = driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select s2=new Select(el2);
	    s2.selectByVisibleText("New York");
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.id("primaryPhoneNumber")).sendKeys("1234567890");
	    
	    Thread.sleep(4000);
	    
	    driver.findElement(By.name("submitButton")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    
	    driver.findElement(By.name("description")).clear();
	    
	    driver.findElement(By.name("importantNote")).sendKeys("Desc is cleared and imp note added");
	    
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	    String st=driver.getTitle();
	    System.out.println(st);
	    
	    driver.quit();
	    
	    
	    
	    
	}

}
