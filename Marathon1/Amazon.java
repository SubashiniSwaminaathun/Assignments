package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
	    
	    //load the url
	    
	    driver.get("https://amazon.in");
	    
	    //maximise
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    Thread.sleep(4000);
	    
	    //Searching bag for b
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for b");
	    
	    Thread.sleep(4000);
	    
	    //Select bag for boysfrom drop down and click submit
	    driver.findElement(By.xpath("(//div[@role='button'])[1]")).click();
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    //fetching count
	    String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	    System.out.println(text);
	    
	    //clicking 1st 2 brands
	    
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
	    
	    //New arrivals
	    driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	    driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
	    
	    
	    //1st bag details
	    
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText());

	    Thread.sleep(2000);
	  //span[@class='a-price']/span[2]
	    String text4=driver.findElement(By.xpath("//span[@class='a-price']/span[2]")).getText();
	    System.out.println("Price :"+text4);
	    


	}

}
