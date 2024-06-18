package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		

		EdgeDriver driver=new EdgeDriver();
	    
	    //load the url
	    
	    driver.get("https://www.abhibus.com/");
	    
	    //maximise
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Thread.sleep(10000);
	    
	    //Entering from station
	    driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	    Thread.sleep(2000);
	    //li[@class='collection-item auto-complete-list-item ']
	    driver.findElement(By.xpath("(//li[@class='collection-item auto-complete-list-item '])")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//li[@class='collection-item auto-complete-list-item '])")).click();
	    
	    //Clicking tomorrow and search
	    driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
	    driver.findElement(By.xpath("//button[text()='Search']")).click();
	    Thread.sleep(2000);
	    
	    //1st bus
	    Thread.sleep(2000);
	    String st=driver.findElement(By.xpath("//h5[@class='title']")).getText();
	    System.out.println(st);
	    
	    //Selecting sleeper
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
	    
	    //Seleting show seats:
	    driver.findElement(By.xpath("(//button[text()='Show Seats'])")).click();
	    
	    //Select seat
	    driver.findElement(By.xpath("(//button[@class='seat sleeper']//*[@fill='white'])")).click();
	    
	    //Select 1st borading point
	    driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
	    
	    driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
	    
	  //div[@id='seating-selected-seat-details']
	  //span[text()='Seat Selected :']
	  //span[text()='Base Fare :']
	    
	    //continue
	  //button[@class='btn btn-shake filled primary md inactive button']
	    
	    driver.getTitle();
	    
	    //get title
	    
	    
	    
	  
	    
	    
	    
	    
	    

	}

}
