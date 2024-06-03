package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver=new EdgeDriver();
		
	    driver.get("https://en-gb.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Create new account")).click();

	    driver.findElement(By.name("firstname")).sendKeys("Test");
	    driver.findElement(By.name("lastname")).sendKeys("User");
	    driver.findElement(By.name("reg_email__")).sendKeys("testuser@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testuser@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("test");
	    
	    WebElement e1 = driver.findElement(By.name("birthday_day"));
	    Select sl1=new Select(e1);
	    sl1.selectByIndex(1);
	    
	    WebElement e2 = driver.findElement(By.name("birthday_month"));
	    Select sl2=new Select(e2);
	    sl2.selectByIndex(1);
	    
	    WebElement e3 = driver.findElement(By.name("birthday_year"));
	    Select sl3=new Select(e3);
	    sl3.selectByValue("1991");
	    
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    driver.findElement(By.xpath("//button[contains(@name,'websub')]")).click();
	    Thread.sleep(5000);
	    driver.quit();
	    
	    
	    
	}

}
