package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
	    
	    //load the url
	    
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	    //maximise
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //to enter the value in the text field-sendKeys
	    
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    
	    //to enter the password
	    
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	    //By classname
	    
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    //By link text
	    //driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.partialLinkText("M/S")).click();
	    
		//- Click on the Contacts button. 
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    
		//- Click on Merge Contacts. 
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	    
		//- Click on the widget of the "From Contact". 
	    driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	    
		//- Click on the first resulting contact. 
	    Set<String> setStr = driver.getWindowHandles();
	    List<String> allWindow=new ArrayList<String>(setStr);
	    driver.switchTo().window(allWindow.get(1));
	    
	    Thread.sleep(4000);
	    //System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//a[@class='linktext']")).click();
	    driver.switchTo().window(allWindow.get(0));
	    
	    
	    
		//- Click on the widget of the "To Contact". 
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	    
		// Click on the second resulting contact.
	    Set<String> setStr1 = driver.getWindowHandles();
	    List<String> allWindow1=new ArrayList<String>(setStr1);
	    driver.switchTo().window(allWindow1.get(1));
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
	    driver.switchTo().window(allWindow1.get(0));
	    
	    
		//- Click on the Merge button. 
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	    
		//- Accept the alert. 
	    Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
	    
		//- Verify the title of the page.
	    System.out.println(driver.getTitle());
	    

	}

}
