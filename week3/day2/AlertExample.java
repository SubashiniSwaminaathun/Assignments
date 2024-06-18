package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/alert.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	    String inp="Subashini";
	    Alert al1 = driver.switchTo().alert();
	    Thread.sleep(4000);
	    al1.sendKeys(inp);
	    Thread.sleep(4000);

	    al1.accept();
	    String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	    System.out.println(text);
	    
	    if(text.contains(inp)) {
	    	System.out.println("Entered text is matching");
	    }
	    else {
	    	System.out.println("Entered text is not there");
	    }
	        

	}

}
